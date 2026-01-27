package com.ibm.objects;

class BankAccount
{
	String accountHolderName;
	int accountNumber;
	double balance;
	
	BankAccount(String accountHolderName,int accountNumber,double balance)
	{
		this.accountHolderName=accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void display()
	{
		System.out.println("Account Holder Name:"+accountHolderName);
		System.out.println("Account Number:"+ accountNumber);
		System.out.println("Account Balance :"+balance);
		
	}
}

public class Application
{
	public static void main( String[] args )
	{
		
		//BankAccount account1 = new BankAccount("Nithin", 101, 50000);
		//account1.display();
		
		//Employee employee = new Employee();
		//employee.age=30;
		//employee.name="Nithin";
		//employee.employeeID=102;
		
		//employee.display();
		//employee.displayEmployee();
		
		//Student student = new Student();
		//student.age=20;
		//student.name="nithin";
		//student.rollNo=105;
		
		//student.display();
		//student.displayStudent();
		
//		Car car = new Car();
//		car.honk();
//		System.out.println(car.brand+" "+car.modelName);
		
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		
	}
}