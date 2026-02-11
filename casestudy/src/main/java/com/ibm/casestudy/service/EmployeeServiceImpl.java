package com.ibm.casestudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.casestudy.dao.EmployeeRepository;
import com.ibm.casestudy.dto.EmployeeDto;
import com.ibm.casestudy.model.Employee;

@Service
public class EmployeeServiceImpl  implements EmployeeSerivce{

	
	private EmployeeRepository employeeRepository;	
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}


	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
		String firstName = dto.getFirstName().trim();
		String middleName = dto.getMiddleName() == null ? "" : dto.getMiddleName().trim();
		String lastName = dto.getLastName().trim();
		String position = dto.getPosition().trim();
		
		boolean exists = employeeRepository.existsByFirstNameIgnoreCaseAndMiddleNameIgnoreCaseAndLastNameIgnoreCaseAndBirthDate
						 (firstName, middleName, lastName, dto.getBirthDate());
		
		if(exists) {
			throw new IllegalArgumentException("Employee Already Exists");
		}
		
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setMiddleName(middleName);
		employee.setLastName(lastName);
		employee.setBirthDate(dto.getBirthDate());
		employee.setPosition(position);
		
		employeeRepository.save(employee);
		
		dto.setId(employee.getId());
		
		return dto;
	}
	
}
