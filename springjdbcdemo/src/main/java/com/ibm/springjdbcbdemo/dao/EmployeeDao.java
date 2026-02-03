package com.ibm.springjdbcbdemo.dao;

import java.util.List;

import com.ibm.springjdbcbdemo.model.Employee;

public interface EmployeeDao {
	int save(Employee e);

	int update(Employee e);

	int delete(int id);

	Employee findById(int id);

	List<Employee> findAll();
}
