package com.ibm.springmvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.springmvc.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jdbcTemplateObject;
	
	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate){
		this.jdbcTemplateObject = jdbcTemplate;
	}
	
	@Override
	public int save(Employee e) {
		
	String SQL = "insert into Employee(name,phone,email) values (?,?,?)";
	int rowsEffected = jdbcTemplateObject.update(SQL,e.getName(),e.getEmail(),e.getPhone());
	System.out.println("Created Record Successfully");
	return rowsEffected;
	}

}
