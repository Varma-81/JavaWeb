package com.ibm.staticfeature;


class Test
{
	static int value;
	
	Test()
	{
		System.out.println("Constructor Called");//3
	}
	
	static
	{
		System.out.println("Static Initializer Called");//1
		value=15;
	}
	
	{
		System.out.println("Inline Block Called");//2
	}
}

public class Application
{
	public static void main( String[] args )
	{
		new Test();
	}
	
}