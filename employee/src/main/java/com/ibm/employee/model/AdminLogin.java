package com.ibm.employee.model;

import javax.validation.constraints.NotBlank;

public class AdminLogin {
	
	
	@NotBlank(message = "UserName is required for login")
	private String userName;
	
	@NotBlank(message = "Password is required for loginSS")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
