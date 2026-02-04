package com.ibm.springmvc.dao;

import javax.sql.DataSource;

import com.ibm.springmvc.model.Employee;

public interface EmployeeDao {
	int save(Employee e);
}
