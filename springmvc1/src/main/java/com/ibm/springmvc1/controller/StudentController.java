package com.ibm.springmvc1.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.springmvc1.model.Student;
import com.ibm.springmvc1.service.StudentService;
import com.ibm.springmvc1.service.StudentServiceImpl;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/form")
	public String showStudentForm(Model model)
	{
		model.addAttribute("student",new Student() );
		return "student-form";
	}
	
	@PostMapping("/save")
	public String saveStudent(@Valid @ModelAttribute("student") Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "student-form";
		}
		int flag = studentService.insertStudent(student);
		if(flag==1)
		{
			return "student-details";
		}
		return 	"student-form";	
		
	}
	
}
