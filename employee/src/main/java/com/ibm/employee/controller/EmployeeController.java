package com.ibm.employee.controller;

import javax.swing.JOptionPane;
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

import com.ibm.employee.model.AdminLogin;
import com.ibm.employee.service.AdminLoginService;

@Controller
@RequestMapping("/system")
public class EmployeeController {

	@Autowired
	private	AdminLoginService adminService; 
	
	@GetMapping("/login")
	public String adminLogin(Model model)
	{
		model.addAttribute("admin", new AdminLogin());
		return "admin-login";
	}
	
	@PostMapping("/homepage")
	public String checkLogin(@Valid  @ModelAttribute("admin") AdminLogin admin,BindingResult result,
			RedirectAttributes redirectAttributes )
	{
		boolean isValid = adminService.validateAdmin(admin);
		if(isValid)
		{
			return "home-page";
		}
		else
		{
			return "admin-login";
		}
		
	}
	
	
}
