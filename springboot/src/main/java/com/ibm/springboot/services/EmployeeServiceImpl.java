package com.ibm.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ibm.springboot.model.Employee;
import com.ibm.springboot.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private final EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Employee not found with id: "+id));
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employeeDetails) {
		Employee employee = getEmployeeById(id);
		employee.setFirstName(employeeDetails.getFirstName());
		employee.setLastName(employeeDetails.getLastName());
		employee.setEmail(employeeDetails.getEmail());
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		Employee employee = getEmployeeById(id);
		employeeRepository.delete(employee);
//		employeeRepository.deleteById(id);
		
	}

	@Override
	public Optional<Employee> findByFirstnameAndEmail(String firstName, String email) {
		return employeeRepository.findByFirstNameAndEmail(firstName, email);
		
	}

}
