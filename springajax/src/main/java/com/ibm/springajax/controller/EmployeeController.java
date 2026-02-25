package com.ibm.springajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ibm.springajax.model.Employee;
import com.ibm.springajax.service.EmployeeService;

@Controller
public class EmployeeController {
    
    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/employee/search")
    public String showSearchPage() {
        return "employeeSearch";
    }
    
    @GetMapping(value="/employee/search/ajax",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Employee> searchEmployeesAjax(@RequestParam("term") String searchTerm) {
    	Thread thread = new Thread();
    	try {
			thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return employeeService.searchEmployees(searchTerm);
    }
}