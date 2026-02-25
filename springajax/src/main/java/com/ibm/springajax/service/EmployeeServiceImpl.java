package com.ibm.springajax.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ibm.springajax.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	 private List<Employee> employees;
	    
	    public EmployeeServiceImpl() {
	        
	        employees = new ArrayList<>();
	        employees.add(new Employee(1, "John", "Doe", "IT", "john.doe@example.com"));
	        employees.add(new Employee(2, "Jane", "Smith", "HR", "jane.smith@example.com"));
	        employees.add(new Employee(3, "Robert", "Johnson", "Finance", "robert.johnson@example.com"));
	        employees.add(new Employee(4, "Emily", "Williams", "Marketing", "emily.williams@example.com"));
	        employees.add(new Employee(5, "Michael", "Brown", "IT", "michael.brown@example.com"));
	        employees.add(new Employee(6,"Nitin","Varma","IT","nithin@live.com"));
	    }
	    
	    @Override
	    public List<Employee> searchEmployees(String searchTerm) {
	        if (searchTerm == null || searchTerm.trim().isEmpty()) {
	            return employees;
	        }
	        
	        final String lowerCaseSearchTerm = searchTerm.toLowerCase();
	        
	        return employees.stream()
	            .filter(employee -> 
	                employee.getFirstName().toLowerCase().contains(lowerCaseSearchTerm) ||
	                employee.getLastName().toLowerCase().contains(lowerCaseSearchTerm) ||
	                employee.getDepartment().toLowerCase().contains(lowerCaseSearchTerm) ||
	                employee.getEmail().toLowerCase().contains(lowerCaseSearchTerm)
	            )
	            .collect(Collectors.toList());
	    }

}