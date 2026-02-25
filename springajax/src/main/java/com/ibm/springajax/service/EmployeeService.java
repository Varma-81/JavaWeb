package com.ibm.springajax.service;

import java.util.List;

import com.ibm.springajax.model.Employee;

public interface EmployeeService {

	 List<Employee> searchEmployees(String searchTerm);
	
}
