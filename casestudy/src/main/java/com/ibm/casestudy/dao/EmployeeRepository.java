package com.ibm.casestudy.dao;

import java.time.LocalDate;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.casestudy.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{	 
	
	
	boolean existsByFirstNameIgnoreCaseAndMiddleNameIgnoreCaseAndLastNameIgnoreCaseAndBirthDate(
            String firstName,
            String middleName,
            String lastName,
            LocalDate birthDate
    );
	
	
}
