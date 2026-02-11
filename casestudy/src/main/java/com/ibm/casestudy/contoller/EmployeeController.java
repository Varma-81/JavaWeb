package com.ibm.casestudy.contoller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ibm.casestudy.dto.EmployeeDto;
import com.ibm.casestudy.service.EmployeeSerivce;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	
	private EmployeeSerivce employeeSerivce;
	
	//@Autowired
//	public EmployeeController(EmployeeSerivce employeeSerivce) {
//	
//		this.employeeSerivce = employeeSerivce;
//	}

	@GetMapping("/homepage")
	public String homePage()
	{
		return "home-page";
		
	}
	
	@GetMapping("/add")
	public String addEmployee(Model model)
	{
		model.addAttribute("employee", new EmployeeDto());
		return "add-employee";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@Valid @ModelAttribute("employee") EmployeeDto empDto,
			BindingResult result,RedirectAttributes redirect,Model model){
		
		if(result.hasErrors())
		{
			return "add-employee";
		}
		
		try
		{
			employeeSerivce.addEmployee(empDto);
			redirect.addFlashAttribute("successMessage", "Employee added successfully. UID: " + empDto.getId());
			return "redirect:/employee/add";
		}catch(IllegalArgumentException e)
		{
			model.addAttribute("duplicateMessage",e.getMessage());
			return "add-employee";
		}catch(Exception e) {
			model.addAttribute("errorMessage","Employee could not be added due to system error.");
			return "add-employee";
		}
		
		
	}
	
}
