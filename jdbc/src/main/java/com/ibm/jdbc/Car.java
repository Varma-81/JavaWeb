package com.ibm.jdbc;

public class Car {
	private String company;
	private String model;
	private int  price;
	
	
	public Car() {
		
	}

	public Car(String company, String model, int price) {
		this.company = company;
		this.model = model;
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
