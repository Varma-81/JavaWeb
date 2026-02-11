package com.ibm.employee.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.employee.mapper.EmployeeMapper;
import com.ibm.employee.model.CompensationType;
import com.ibm.employee.model.Employee;
import com.ibm.employee.model.EmployeeCompensation;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplateObject;
	
	//Add Employee
		@Override
		public int addEmployee(Employee e) {
			String query = "insert into employee(firstname,middlename,lastname,birthdate,position) values(?,?,?,?,?)";
			try
			{
				return jdbcTemplateObject.update(
						query,
						e.getFirstName(),
						e.getMiddleName(),
						e.getLastName(),
						e.getBirthDate(),
						e.getPosition());

			}
			catch(DataAccessException message)
			{
				System.out.println("Failed to insert Employee:"+message);
			}
			return 0;
			
		}

		
		//Check If Employee Exists.
		@Override
		public boolean checkEmployee(String firstName, String middleName, String lastName, Date birthDate) {
			String query = "Select COUNT(*) from employee where firstname=? AND middlename=? AND lastname=? AND birthDate=?";
			
			Integer count = jdbcTemplateObject.queryForObject(query, Integer.class,firstName.trim(),middleName.trim(),lastName.trim(),birthDate);
		
			return count!=null && count>0;
			
		}


		@Override
		public List<Employee> getEmployees(String firstName, String lastName, String position) {
			StringBuilder sql = new StringBuilder("Select * from employee where 1=1");
			List<Object> params = new ArrayList<>();
			
			if (firstName != null && !firstName.trim().isEmpty()) {
		        sql.append(" AND firstname = ?");
		        params.add(firstName);
		    }

		    if (lastName != null && !lastName.trim().isEmpty()) {
		        sql.append(" AND lastname = ?");
		        params.add(lastName);
		    }
			
		    if (position != null && !position.trim().isEmpty()) {
		        sql.append(" AND position = ?");
		        params.add(position);
		    }
		    
			List<Employee> employees=jdbcTemplateObject.query(sql.toString(), new EmployeeMapper(),params.toArray());
			return employees;
			
		}

		@Override
		public Employee getEmployeeById(Long employeeId) {
			String query = "Select * from employee where eid=?";
			Employee employee = jdbcTemplateObject.queryForObject(query, new EmployeeMapper(),employeeId);
			return employee;
		}
		
		@Override
		public Employee findDuplicateEmployee(Employee emp)
		{
			String query = "Select * from employee where "
					+ "firstname=? AND middlename=? AND lastname=? "
					+ "AND birthDate=? AND position=? AND eid<>?";
			
			List<Employee> empList = jdbcTemplateObject.query(query,new EmployeeMapper(),
					emp.getFirstName(),emp.getMiddleName(),emp.getLastName(),
					emp.getBirthDate(),emp.getPosition(),emp.getUid());
			
			return empList.isEmpty()?null:empList.get(0);
			
		}
		
		public int updateEmployee(Employee emp)
		{
			String query = "update employee set firstname=?,middlename=?,lastname=?,birthDate=?,position=? where eid=?";
			int updatedResult = jdbcTemplateObject.update(query,emp.getFirstName()
					,emp.getMiddleName(),
					emp.getLastName(),
					emp.getBirthDate(),
					emp.getPosition(),
					emp.getUid());
			return updatedResult;
		}


		@Override
		public boolean salaryExistsForMonth(Long eid, Date date) {
			
			 Calendar cal = Calendar.getInstance();
			    cal.setTime(date);

			 int year = cal.get(Calendar.YEAR);
			 int month = cal.get(Calendar.MONTH) + 1;
			String sql = "Select COUNT(*) from EmployeeCompensation "
					+ "where eid=? AND "
					+ "compensationType=?"
					+"AND YEAR(compDate) = ? "
					+"AND MONTH(compDate) = ?";
			Integer count = jdbcTemplateObject.queryForObject(sql, Integer.class,
					eid,
					CompensationType.SALARY.name(),
					year
					,month);
			return count!=null && count>0;
		}


		@Override
		public int addCompensation(EmployeeCompensation comp) {
			
			String sql = "INSERT INTO EmployeeCompensation(eid,compensationType,amount,description,compDate) values (?,?,?,?,?)";
			
			return jdbcTemplateObject.update(sql,comp.getEid(),
					comp.getCompensationType().name(),
					comp.getAmount(),
					comp.getDescription(),
					comp.getCompDate());
			
		}
		
		

}
