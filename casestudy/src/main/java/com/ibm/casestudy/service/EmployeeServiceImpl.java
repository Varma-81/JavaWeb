package com.ibm.casestudy.service;

import org.springframework.stereotype.Service;

import com.ibm.casestudy.dao.EmployeeRepository;
import com.ibm.casestudy.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
