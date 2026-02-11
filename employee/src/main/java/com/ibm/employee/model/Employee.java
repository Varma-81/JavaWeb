package com.ibm.employee.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.springframework.format.annotation.DateTimeFormat;


public class Employee {
	
	private Long uid;
	
	@NotBlank(message = "FirstName is Required")
	private String firstName;
	
	private String middleName;
	
	@NotBlank(message = "LastName is Required")
	private String lastName;
	
	@NotNull
	@PastOrPresent(message = "Birth date cannot be later than today")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthDate;
	
	@NotBlank(message = "Position is Required")
	private String position;
	
	
	public Employee() {
		
	}
	
	public Employee(Long uid, String firstName, String middleName, String lastName, Date birthDate, String position) {
		
		this.uid = uid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.position = position;
	}
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
