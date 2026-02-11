package com.ibm.employee.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class EmployeeCompensation {

	private Long cid;
	
	@NotNull(message = "Employee ID is required")
	private Long eid;
	
	@NotNull(message="Compensation Type is required")
	private CompensationType compensationType;
	
	@NotNull(message = "Amount is required")
	private Double amount;
	
	
	private String description;
	
	
	@NotNull(message = "Compensation Date is required")
	@DateTimeFormat(pattern = "yyyy-MM")
	private Date compDate;


	public Long getCid() {
		return cid;
	}


	public void setCid(Long cid) {
		this.cid = cid;
	}


	public Long getEid() {
		return eid;
	}


	public void setEid(Long eid) {
		this.eid = eid;
	}


	public CompensationType getCompensationType() {
		return compensationType;
	}


	public void setCompensationType(CompensationType compensationType) {
		this.compensationType = compensationType;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getCompDate() {
		return compDate;
	}


	public void setCompDate(Date compDate) {
		this.compDate = compDate;
	}
	
	
	
	
}
