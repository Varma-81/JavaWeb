package com.ibm.employee.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibm.employee.model.AdminLogin;

public class AdminMapper implements RowMapper<AdminLogin> {

	@Override
	public AdminLogin mapRow(ResultSet rs, int rowNum) throws SQLException {
		AdminLogin admin = new AdminLogin();
		admin.setUserName(rs.getString("userName"));
		admin.setPassword(rs.getString("password"));
		return admin;
	}

}
