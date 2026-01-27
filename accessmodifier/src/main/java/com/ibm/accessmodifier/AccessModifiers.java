package com.ibm.accessmodifier;

public class AccessModifiers
{
	private int prt = 10;
	public int pub = 20;;
	protected int prot = 30;
	int dInt = 40;
	
	public void display()
	{
		System.out.println("WITHIN SAME CLASS");
		System.out.println("Public:"+prt);
		System.out.println("Private:"+pub);
		System.out.println("Protected:"+prot);
		System.out.println("Default:"+dInt);
	}
	
}