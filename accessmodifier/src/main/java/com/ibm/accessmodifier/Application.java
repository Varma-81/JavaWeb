package com.ibm.accessmodifier;

import com.ibm.accessmodifier.diff.MyClass;

class SubClass extends AccessModifiers
{
	public void print()
	{
		//		System.out.println("Public:"+prt);
		System.out.println("WITHIN SUB CLASS");
		System.out.println("Private:"+pub);
		System.out.println("Protected:"+prot);
		System.out.println("Default:"+dInt);
	}
}

public class Application
{
	public static void main( String[] args )
	{
		AccessModifiers accessModifier = new AccessModifiers();
		accessModifier.display();
		
		SubClass subClass = new SubClass();
		subClass.print();
		
		System.out.println("WITHIN SAME PACKAGE");
		System.out.println("Public :"+accessModifier.pub);
		//		System.out.println("Private:"+accessModifier.prt);
		System.out.println("Protected:"+accessModifier.prot);
		System.out.println("Default:"+accessModifier.dInt);
		
		MyClass myClass = new MyClass();
		System.out.println("UNIVERSE");	
		myClass.access();
		
	}
}