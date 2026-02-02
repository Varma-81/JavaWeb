package com.ibm.spring;


import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.spring.beans.TextEditior;
import com.ibm.spring.services.OrderService;

public class Application
{
	public static void main( String[] args )
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		OrderService orderService = (OrderService)context.getBean("orderService");
		orderService.makePayment(1000.50);
		System.out.println("end");
		
		
		
		
		
//		TextEditior textEditior = (TextEditior) context.getBean("textEditior");
//		textEditior.spellCheck(); 
//		System.out.println("End");
//				
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//		
//		TextEditior editior = (TextEditior)context.getBean("textEditior");
//		editior.spellCheck();
	
		
		

		
	}
}

//2.
//TextEditior textEditor = (TextEditior) context.getBean("textEditior");	
//textEditor.spellCheck();
//
//JavaCollection jc = (JavaCollection)context.getBean("javaCollection");
//System.out.println("List Address");
//List<String> listAddress = jc.getAddressList();
//listAddress.forEach(System.out::println);
//
//System.out.println("Set Address");
//Set<String> setAddress = jc.getAddressSet();
//setAddress.forEach(System.out::println);
//
//System.out.println("Address Map");
//Map<String,String> mapAddress = jc.getAddressMap();
//mapAddress.forEach((key,value)->System.out.println("Key "+key+" : "+" value "+" : "+value));
//
//System.out.println("Properties");
//Properties addressProperties = jc.getAddressProp();
//addressProperties.forEach((key,value)->System.out.println("Key "+key+" : "+" value "+" : "+value));
//

//1.
//SpellChecker spellChecker1 = (SpellChecker) context.getBean("spellChecker1");
//
//TextEditior textEditor = (TextEditior) context.getBean("textEditor");
//
//textEditor.spellCheck();

//SpellChecker spellChecker2 = (SpellChecker) context.getBean("spellChecker1");
//
//SpellChecker spellChecker3 = (SpellChecker) context.getBean("spellChecker1");

//SpellChecker spellChecker1 = (SpellChecker) context.getBean("spellChecker1");
//ClassPathXmlApplicationContext cpxaContext=(ClassPathXmlApplicationContext) context;
//cpxaContext.registerShutdownHook();

//