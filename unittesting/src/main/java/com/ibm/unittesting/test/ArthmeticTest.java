package com.ibm.unittesting.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ibm.unittesting.math.Arithmetic;

public class ArthmeticTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Starting Arithmetic Class Tests");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of the class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Starting each method test execution");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End of each method test");
	}

	@Test
	public void test() {
		int expectedResult = 8;
		Arithmetic arithmetic = new Arithmetic();
		int actualResult = arithmetic.sum(4, 4);
		
		assertEquals("Comparing results",expectedResult,actualResult);
	}

}
