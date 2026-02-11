package com.ibm.employee.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ibm.employee.dto.EmployeeDto;
import com.ibm.employee.exception.DuplicateEmployeeException;
import com.ibm.employee.model.AdminLogin;
import com.ibm.employee.model.Employee;
import com.ibm.employee.model.EmployeeCompensation;
import com.ibm.employee.service.AdminLoginService;
import com.ibm.employee.service.EmployeeService;

@Controller
@RequestMapping("/system")
public class EmployeeController {

	@Autowired
	private	AdminLoginService adminService; 
	
	@Autowired
	private EmployeeService employeeService;
	
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
			return "redirect:/system/login";
		}
		
	}
	
	@GetMapping("/add")
	public String addEmployee(Model model)
	{
		model.addAttribute("employee",new Employee());
		
		return "add-employee";
	}
	
	@PostMapping("/add")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "add-employee";
		}
		
		try{
			employeeService.addEmployee(employee);
			model.addAttribute("successMessage","Employee Added Successfully");
			return "add-employee";
		}catch(DuplicateEmployeeException ex) {
			model.addAttribute("duplicateError", ex.getMessage());
	        return "add-employee";
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			model.addAttribute("genericError", "Something went wrong. Please try again.");
	        return "add-employee";
		}
	}
	
	
	@GetMapping("/search")
	public String searchEmployee(Model model)
	{
		model.addAttribute("searchEmployee",new EmployeeDto());
		return "search-employee";
	}
	
	@GetMapping("/search/results")
	public String searchEmployeeResults(@ModelAttribute("searchEmployee") EmployeeDto dto,Model model)
	{
		 
		List<Employee>employeeList = employeeService.searchEmployees(dto.getFirstName(),dto.getLastName(), dto.getPosition());
		model.addAttribute("employeeList", employeeList);
		return "search-employee";
		
	}
	
	@GetMapping("/viewEdit")
	public String viewEditEmployee(@RequestParam("uid") Long eid,Model model)
	{
		Employee emp = employeeService.findByEid(eid);
		model.addAttribute("employee",emp);
		return "view-editEmployee";
		
	}
	
	@PostMapping("/update")
	public String updateEmployee(@Valid @ModelAttribute("employee") Employee employee,Model model,BindingResult result,RedirectAttributes redirectAttributes)
	{
		if(result.hasErrors())
		{
			return "view-editEmployee";
		}
		
		try{
			int res =employeeService.updateEmployee(employee);
			if(res>0)
			{
				 model.addAttribute("successMessage", "Employee updated successfully");
			}
			
		}catch(DuplicateEmployeeException e)
		{
			result.reject("duplicate", e.getMessage());
		}catch(Exception e)
		{
			 result.reject("error", e.getMessage());
		}
		
		return "view-editEmployee";
	}
	
	@GetMapping("/addCompensation")
	public String getCompensation(@RequestParam("uid") Long eid,Model model)
	{
		EmployeeCompensation compensation = new EmployeeCompensation();
		compensation.setEid(eid);
		
		model.addAttribute("compensation",compensation);
		return "add-compensation";
	}
	
	
	@PostMapping("/addCompensation")
	public String addCompensation(@Valid @ModelAttribute("compensation") EmployeeCompensation compensation,
			BindingResult result,Model model,RedirectAttributes redirectAttributes){
		if(result.hasErrors())
		{
			return "add-compensation";
		}
		
		try {
			employeeService.addEmployeeCompensation(compensation);
			redirectAttributes.addFlashAttribute(
		            "successMessage",
		            "Employee Compensation added successfully for Employee ID: " + compensation.getEid()
		        );

		    return "redirect:/system/addCompensation?uid=" + compensation.getEid();
		     
		} catch (DuplicateEmployeeException e) {
			
			 redirectAttributes.addFlashAttribute(
			            "duplicateMessage",
			            "Employee Salary already exists for given month"
			        );

			        // Redirect to GET page → this will create a fresh form with fields reset
			return "redirect:/system/addCompensation?uid=" + compensation.getEid();
		}catch(Exception e)
		{
			 redirectAttributes.addFlashAttribute(
			            "errorMessage",
			            e.getMessage()
			        );

			        // Redirect to GET page → this will create a fresh form with fields reset
			return "redirect:/system/addCompensation?uid=" + compensation.getEid();
		}
		
	}
	
}
