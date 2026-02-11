package com.ibm.employee.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.employee.dao.AdminDAO;
import com.ibm.employee.dao.AdminDaoImpl;
import com.ibm.employee.model.AdminLogin;

@Service
public class AdminServiceImpl implements AdminLoginService{

	@Autowired
	private AdminDAO adminDao;
	
	
	@Override
	public boolean validateAdmin(AdminLogin admin) {
		
		AdminLogin dbAdmin = adminDao.authenticateAdmin(admin);
		
		return dbAdmin!=null;
		
	}

}
