package com.ibm.springjdbcbdemo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.springjdbcbdemo.mapper.DepartmentRowMapper;
import com.ibm.springjdbcbdemo.model.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao{

	private final JdbcTemplate jdbcTemplate;

	public DepartmentDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int save(Department d) {
		return jdbcTemplate.update("INSERT INTO department(name) VALUES (?)", 
				d.getName());
	}

	@Override
	public int update(Department d) {
		return jdbcTemplate.update("UPDATE department SET name=? WHERE id=?", 
				d.getName(), 
				d.getId());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM department WHERE id=?", id);
	}

	@Override
	public Department findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM department WHERE id=?", new DepartmentRowMapper(), id);
	}

	@Override
	public List<Department> findAll() {
		return jdbcTemplate.query("SELECT * FROM department", new DepartmentRowMapper());
	}

}
