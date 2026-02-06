package com.ibm.springmvc1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springmvc1.dao.StudentDao;
import com.ibm.springmvc1.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public int insertStudent(Student student) {
		return studentDao.save(student);
		
	}

}
