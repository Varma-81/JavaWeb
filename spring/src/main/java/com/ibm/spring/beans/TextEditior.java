package com.ibm.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class TextEditior {

	
	private SpellChecker spellChecker;

	public TextEditior() {
		System.out.println("Inside TextEditor no-args constructor");
	}

	
	public TextEditior( SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor");
		this.spellChecker = spellChecker;
	}
	
	public void init()
	{
		System.out.println("Text Editor intialized");
	}
	
	public void destroy()
	{
		System.out.println("Text Editor destroyed");
	}

	@Autowired
//	@Qualifier("spellChecker2")
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	
}
