package com.ibm.springmvc.service;

import javax.sql.DataSource;

import com.ibm.springmvc.model.Employee;

public interface EmployeeService {
	
	public int insertEmployee(Employee employee);
}
