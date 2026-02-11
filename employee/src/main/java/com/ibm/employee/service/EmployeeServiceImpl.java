package com.ibm.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.employee.dao.EmployeeDao;
import com.ibm.employee.exception.DuplicateEmployeeException;
import com.ibm.employee.model.CompensationType;
import com.ibm.employee.model.Employee;
import com.ibm.employee.model.EmployeeCompensation;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public int addEmployee(Employee e) throws DuplicateEmployeeException {
		boolean validData = employeeDao.checkEmployee(e.getFirstName(), e.getMiddleName(), e.getLastName(),e.getBirthDate());
		if(validData)
		{
			throw new DuplicateEmployeeException("Employee AlreadyExists");
		}
		
		return employeeDao.addEmployee(e);
	}

	@Override
	public List<Employee> searchEmployees(String firstName, String lastName, String position) {
		
		List<Employee> employee = employeeDao.getEmployees(firstName, lastName, position);
		return employee;
		
	}

	@Override
	public Employee findByEid(Long eId) {
		Employee employee = employeeDao.getEmployeeById(eId);
		return employee;
	}

	@Override
	public int updateEmployee(Employee emp) throws Exception {
		
		try {
			Employee duplicate = employeeDao.findDuplicateEmployee(emp);
			
			if(duplicate !=null)
			{
				throw new DuplicateEmployeeException("An employee with the same details already exists");
			}
			
			 int rowsAffected = employeeDao.updateEmployee(emp);
	        return rowsAffected;
		}
		catch(DuplicateEmployeeException e)
		{
			throw e;
		}
		catch(Exception e)
		{
			throw new Exception("Error updating employee. Please try again.", e);
		}
		
	}

	@Override
	public void addEmployeeCompensation(EmployeeCompensation compensation) throws DuplicateEmployeeException,Exception {
		
		if(compensation.getCompensationType()==CompensationType.SALARY)
		{
			boolean salaryExists = employeeDao.salaryExistsForMonth(compensation.getEid(), compensation.getCompDate());
			if(salaryExists)
			{
				throw new DuplicateEmployeeException("Salary Already exists for this employee for the selected month");
			}
		}
		
		switch(compensation.getCompensationType())
		{
			case BONUS:
			case COMMISSION:
			case ALLOWANCE:
				if(compensation.getAmount()<=0)
				{
					throw new Exception("Amount Must be Greater than zero");
				}
				if(compensation.getDescription()==null || compensation.getDescription().trim().isEmpty())
				{
					throw new Exception("Description is required");
				}
				break;
				
		  case ADJUSTMENT:
				if(compensation.getAmount()==0)
				{
					throw new Exception("Adjustment cannot be zero");
				}
				if(compensation.getDescription()==null || compensation.getDescription().trim().isEmpty())
				{
					throw new Exception("Description is required");
				}
				break;
				
		  case SALARY:
				break;
		}
		
		employeeDao.addCompensation(compensation);
		
	}

	
}
