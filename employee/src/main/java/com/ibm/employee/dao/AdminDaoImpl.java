package com.ibm.employee.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.employee.mapper.AdminMapper;
import com.ibm.employee.model.AdminLogin;

@Repository
public class AdminDaoImpl implements AdminDAO{

	private JdbcTemplate jdbcTemplateObject;
	
	public AdminDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplateObject=jdbcTemplate;
	}
	
	@Override
	public AdminLogin authenticateAdmin(AdminLogin admin) {
		String query = "SELECT * FROM admin where username =?";
		AdminLogin ad = jdbcTemplateObject.queryForObject(query, new AdminMapper(),admin.getUserName());
		return ad;
	}

}
