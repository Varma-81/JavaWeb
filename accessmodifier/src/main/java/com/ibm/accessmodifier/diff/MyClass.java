package com.ibm.accessmodifier.diff;

import com.ibm.accessmodifier.AccessModifiers;

public class MyClass
{
	public void access()
	{
		AccessModifiers accessModifiers = new AccessModifiers();
		System.out.println("Universe");
		System.out.println("Public :"+accessModifiers.pub);
	}
}