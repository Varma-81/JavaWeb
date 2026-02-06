package com.ibm.employee.dao;

import com.ibm.employee.model.AdminLogin;

public interface AdminDAO {
	AdminLogin authenticateAdmin(AdminLogin admin);
}
