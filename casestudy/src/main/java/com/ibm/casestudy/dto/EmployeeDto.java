package com.ibm.casestudy.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeDto {

	private Long id;
	
	@NotBlank(message="FirstName is required")
	@Pattern(regexp = "^[A-za-z]+$", message="Only Letters are allowed")
	private String firstName;
	
	private String middleName;
	
	@NotBlank(message="LastName is required")
	@Pattern(regexp = "^[A-za-z]+$", message="Only Letters are allowed")
	private String lastName;
	
	@NotBlank(message="BirthDate is required")
	@PastOrPresent(message = "Birth Date cannot be in the future")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
	
	@NotBlank(message="Position is required")
	@Pattern(regexp = "^[A-za-z]+$", message="Only Letters are allowed")
	private String position;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}
