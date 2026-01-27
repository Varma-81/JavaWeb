package com.ibm.objects;

public class Person 
{
	String name;
	int age;
	
	void display()
	{
		System.out.println("Name"+name);
		System.out.println("Age"+age);
	}
}

class Employee extends Person //Single Inheritance.
{
	int employeeID;
	
	void displayEmployee() {
		System.out.println("Employee ID"+employeeID);
	}
}

class Student extends Person
{
	int rollNo;
	
	public void displayStudent()
	{
		System.out.println("Student ID"+rollNo);
	}
}


