package com.ibm.employee.service;

import java.util.List;

import com.ibm.employee.exception.DuplicateEmployeeException;
import com.ibm.employee.model.Employee;
import com.ibm.employee.model.EmployeeCompensation;

public interface EmployeeService {
	int addEmployee(Employee employee) throws DuplicateEmployeeException;
	
	List<Employee> searchEmployees(String firstName,String lastName,String position);
	
	Employee findByEid(Long eId);
	
	int updateEmployee(Employee emp) throws DuplicateEmployeeException, Exception;
	
	void addEmployeeCompensation(EmployeeCompensation compensation) throws DuplicateEmployeeException, Exception;
	
	
	
	
}
