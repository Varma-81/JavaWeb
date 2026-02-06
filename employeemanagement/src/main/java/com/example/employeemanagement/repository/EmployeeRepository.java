package com.example.employeemanagement.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeemanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	Optional<Employee> findByEmail(String email);
    boolean existsByEmail(String email);
}
