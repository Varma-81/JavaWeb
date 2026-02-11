package com.ibm.employee.service;

import java.util.Date;

import com.ibm.employee.model.AdminLogin;

public interface AdminLoginService {
	boolean validateAdmin(AdminLogin admin);
}
