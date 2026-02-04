package com.ibm.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springmvc.dao.EmployeeDaoImpl;
import com.ibm.springmvc.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDaoImpl daoImpl;
	
	@Override
	public int insertEmployee(Employee employee) {
		int rowsEffected = daoImpl.save(employee);
		return rowsEffected;
		
	}

}
