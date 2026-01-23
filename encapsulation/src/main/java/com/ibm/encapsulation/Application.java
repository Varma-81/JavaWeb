package com.ibm.encapsulation;

import com.ibm.encapsulation.pack1.Base1;

public class Application 
{
	public static void main(String[] args) 
	{
		Base1 base1 = new Base1();
		base1.pubf=1;
	}
}



//Universe-within project folder
//public -yes
//private-No
//protected-No
//default-No


//private - used to restrict for read and write.
//Hiding the implementation.

//class Student {
//	private int age;
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//}
//
//public class Application {
//	public static void main(String[] args) {
//		Student student = new Student();
//		student.setAge(10);
//		System.out.println(student.getAge());
//	}
//}
