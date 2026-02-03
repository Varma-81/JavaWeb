package com.ibm.springjdbc.template;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ibm.springjdbc.dao.EmployeeDao;
import com.ibm.springjdbc.mapper.EmployeeMapper;
import com.ibm.springjdbc.model.Employee;

public class EmployeeJDBCTemplate implements EmployeeDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String firstName, String lastName, Integer salary) {
		String SQL = "insert into Employee(firstName,lastName,salary) values (?,?,?)";
		jdbcTemplateObject.update(SQL,firstName,lastName,salary);
		System.out.println("Created Record Name = "+firstName+" Salary= "+salary);
		
	}

	@Override
	public Employee getEmployee(Integer id) {
		String SQL = "select * from Employee where id = ?";
		Employee employee = jdbcTemplateObject.queryForObject(SQL,new EmployeeMapper(),id);
		return employee;
	}

	@Override
	public List<Employee> listEmployees() {
		String SQL = "select * from Employee";
		List<Employee> employees = jdbcTemplateObject.query(SQL, new EmployeeMapper());
		return employees;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from Employee where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = "+id);
		
	}

	@Override
	public void update(Integer id, String firstName, String lastName, Integer salary) {
		String SQL = "update Employee set salary = ? where id=?";
		jdbcTemplateObject.update(SQL,salary,id);
		System.out.println("Updated Record with ID = "+id);
		
//		String SQL = "update Employee set firstName = ?, lastName = ?, salary = ? where id = ?";
//		jdbcTemplateObject.update(SQL,firstName,lastName,salary,id);
		
	}

}


//UPDATE Employee SET firstName = ?, lastName = ?, salary = ? WHERE id = ?;
