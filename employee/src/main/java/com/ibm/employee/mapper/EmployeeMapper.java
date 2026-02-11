package com.ibm.employee.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibm.employee.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setUid(rs.getLong("eid"));
		e.setFirstName(rs.getString("firstname"));
		e.setMiddleName(rs.getString("middlename"));
		e.setLastName(rs.getString("lastname"));
		e.setBirthDate(rs.getDate("birthDate"));
		e.setPosition(rs.getString("position"));
		
		return e;
	}
	

}
