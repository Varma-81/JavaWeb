package com.ibm.objects;

public class Vehicle {
	protected String brand = "Ford";
	
	void honk()
	{
		System.out.println("Tuut..,Tuut...");
	}
}

class Car extends Vehicle{
	String modelName = "Mustang";
	}

