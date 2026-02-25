package com.ibm.springmvc2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.springmvc2.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
