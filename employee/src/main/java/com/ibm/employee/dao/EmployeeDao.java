package com.ibm.employee.dao;

import java.util.Date;
import java.util.List;

import com.ibm.employee.model.Employee;
import com.ibm.employee.model.EmployeeCompensation;

public interface EmployeeDao {

	int addEmployee(Employee employee);
	
	boolean checkEmployee(String firstName,String middleName,String lastName,Date birthDate);
	
	List<Employee> getEmployees(String firstName,String lastName,String position);
	
	Employee getEmployeeById(Long employeeId);
	
	Employee findDuplicateEmployee(Employee emp);
	
	int updateEmployee(Employee emp);
	
	boolean salaryExistsForMonth(Long eid, Date date);
	
	int addCompensation(EmployeeCompensation compensation);
	
}


