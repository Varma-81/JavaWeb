package com.ibm.springmvc1.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@NotBlank(message = "Name is required")
	@Size(min=3,max=10,message="Name must be between 3-10 Characters")
	private String name;
	
	@NotBlank(message = "Department is required")
	private String department;
	
	@Pattern(regexp = "^[0-9]{10}$", message="Phone must be 10 digits")
	private String phone;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
