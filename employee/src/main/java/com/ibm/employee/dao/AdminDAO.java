package com.ibm.employee.dao;

import java.util.Date;

import com.ibm.employee.model.AdminLogin;
import com.ibm.employee.model.Employee;

public interface AdminDAO {
	AdminLogin authenticateAdmin(AdminLogin admin);
	
}
