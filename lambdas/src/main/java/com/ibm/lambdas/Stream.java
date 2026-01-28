package com.ibm.lambdas;

import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void displayStream()
	{
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		numbers.forEach((number)->System.out.println(number));
		
		numbers.forEach(number -> System.out.println(number));
		
		numbers.forEach(System.out::println);
		
		numbers.stream()
		.map(element ->String.valueOf(element))
		.forEach(System.out::println);
		
		numbers.stream()
		.map(String::valueOf)
		.forEach(System.out::println);
		
		System.out.println(numbers.stream()
				.reduce(0,(total,element)->Integer.sum(total,element)));
		
		System.out.println(numbers.stream()
				.reduce(0,Integer::sum));
		
	}
	
}
