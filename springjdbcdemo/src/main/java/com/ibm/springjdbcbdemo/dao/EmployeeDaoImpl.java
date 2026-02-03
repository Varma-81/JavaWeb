package com.ibm.springjdbcbdemo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ibm.springjdbcbdemo.mapper.EmployeeRowMapper;
import com.ibm.springjdbcbdemo.model.Employee;


@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	
	private final JdbcTemplate jdbcTemplate;

	public EmployeeDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int save(Employee e) {
		return jdbcTemplate.update("INSERT INTO employee(name, salary, department_id) VALUES (?,?,?)",
				e.getName(),
				e.getSalary(),
				e.getDepartmentId());//varying length array
	}

	@Override
	public int update(Employee e) {
		return jdbcTemplate.update("UPDATE employee SET name=?, salary=?, department_id=? WHERE id=?",
				e.getName(),
				e.getSalary(),
				e.getDepartmentId(), 
				e.getId());
	}

	@Override
	public int delete(int id) {
		return jdbcTemplate.update("DELETE FROM employee WHERE id=?", id);
	}

	@Override
	public Employee findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM employee WHERE id=?", new EmployeeRowMapper(), id);
	}

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("SELECT * FROM employee", new EmployeeRowMapper());
	}

}
