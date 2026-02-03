package com.ibm.springjdbcdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.ibm.springjdbcbdemo.config.DatabaseConfig;
import com.ibm.springjdbcbdemo.dao.DepartmentDao;
import com.ibm.springjdbcbdemo.dao.EmployeeDao;
import com.ibm.springjdbcbdemo.model.Department;
import com.ibm.springjdbcbdemo.model.Employee;

public class Application
{
	public static void main( String[] args )
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		
		DepartmentDao departmentDao = ctx.getBean(DepartmentDao.class);
		EmployeeDao employeeDao = ctx.getBean(EmployeeDao.class);

		Department d = new Department();
		d.setName("IT");
		departmentDao.save(d);

		Employee e = new Employee();
		e.setName("Arafath");
		e.setSalary(15000);
		e.setDepartmentId(1);
		employeeDao.save(e);

		employeeDao.findAll().forEach(emp -> System.out.println(emp.getName() + " - " + emp.getDepartmentId()+ " - " + emp.getSalary()));

		ctx.close();
		
	}
}