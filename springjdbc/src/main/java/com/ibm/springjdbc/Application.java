package com.ibm.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.springjdbc.model.Employee;
import com.ibm.springjdbc.template.EmployeeJDBCTemplate;

public class Application
{
	public static void main( String[] args )
	{
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc.xml");
		
		EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate)context.getBean("employeeJDBCTemplateBean");
		
		System.out.println("-----------Records Creation----------");
//		employeeJDBCTemplate.create("NITHIN","VARMA", 1000000);
//		employeeJDBCTemplate.create("RAJINI", "KANTH",2000000);
//		employeeJDBCTemplate.create("ALLU", "ARJUN",3000000);
		
		System.out.println("--------Listing Multiple Records---------------");
		List<Employee> employees = employeeJDBCTemplate.listEmployees();
		
		for(Employee employee:employees)
		{
			System.out.print("ID : "+employee.getId());
			System.out.print(", FirstName : "+employee.getFirstName());
			System.out.print(", LastName : "+employee.getLastName());
			System.out.println(", Salary: "+employee.getSalary());
		}
//		
//		System.out.println("--------Updating Records---------------");
//		employeeJDBCTemplate.update(3, "MAX","VERSTAPPEN",5000000);
//		
//		Employee employee = employeeJDBCTemplate.getEmployee(3);
//		System.out.print("ID : "+employee.getId());
//		System.out.print(", FirstName : "+employee.getFirstName());
//		System.out.print(", LastName : "+employee.getLastName());
//		System.out.println(", Salary: "+employee.getSalary());
//		
//		System.out.println("------------Deleting Record--------------");
//		employeeJDBCTemplate.delete(3);
		
		System.out.println("-------------Getting a Record----------");
		Employee employee1= employeeJDBCTemplate.getEmployee(2);
		System.out.print("ID : "+employee1.getId());
		System.out.print(", FirstName : "+employee1.getFirstName());
		System.out.print(", LastName : "+employee1.getLastName());
		System.out.println(", Salary: "+employee1.getSalary());
	}
}