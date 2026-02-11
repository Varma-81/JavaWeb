package com.ibm.employee.dao;

import java.util.Date;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.employee.mapper.AdminMapper;
import com.ibm.employee.model.AdminLogin;
import com.ibm.employee.model.Employee;

@Repository
public class AdminDaoImpl implements AdminDAO{

	private JdbcTemplate jdbcTemplateObject;
	
	public AdminDaoImpl(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplateObject=jdbcTemplate;
	}
	
	
    //Admin Login
	@Override
	public AdminLogin authenticateAdmin(AdminLogin admin) {
		String query = "SELECT * FROM admin where username =?";
		try
		{
			AdminLogin ad = jdbcTemplateObject.queryForObject(query, new AdminMapper(),admin.getUserName());
			if(ad.getPassword().equals(admin.getPassword()))
			{
				return ad;
			}
			else
			{
				return null;
			}
		}catch(DataAccessException e)
		{
			return null;
		}

	}


}
