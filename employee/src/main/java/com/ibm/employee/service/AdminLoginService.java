package com.ibm.employee.service;

import com.ibm.employee.model.AdminLogin;

public interface AdminLoginService {
	boolean validateAdmin(AdminLogin admin);
}
