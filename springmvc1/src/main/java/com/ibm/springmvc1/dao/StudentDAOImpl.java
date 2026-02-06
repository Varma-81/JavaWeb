package com.ibm.springmvc1.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.springmvc1.model.Student;

@Repository
public class StudentDAOImpl implements StudentDao{

//	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource)
	{
//		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int save(Student student) {
		String sql = "insert into student (name,department,phone) values(?,?,?)";
		int rowsEffected=jdbcTemplateObject.update(sql, student.getName(),student.getDepartment(),student.getPhone());
		return rowsEffected;
	}

}
