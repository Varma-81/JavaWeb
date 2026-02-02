package com.ibm.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {

	private int id;

	public SpellChecker() {
		System.out.println("Inside SpellChecker Constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	 
	public void checkSpelling()
	{
		System.out.println("Inside checkSpelling");
	}
	
	
}
