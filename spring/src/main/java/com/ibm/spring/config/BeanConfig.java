package com.ibm.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ibm.spring.beans.SpellChecker;
import com.ibm.spring.beans.TextEditior;

@Configuration
public class BeanConfig {
	
	@Bean("textEditior")
	public TextEditior getTextEditior()
	{
		return new TextEditior();
	}
	
	@Bean
	public SpellChecker getSpellChecker()
	{
		return new SpellChecker();
	}
	
}
