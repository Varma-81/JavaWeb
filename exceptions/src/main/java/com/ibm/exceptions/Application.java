package com.ibm.exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Application
{
	
	public static int testFinallyBlock()
	{
		int[] a = new int[2];
		a[1]=10;
		try
		{
			return a[1];
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error Found");
		}finally
		{
			a[0]=6;
			System.out.println("First Element: "+a[0]);
			System.out.println("Finally Block Executed Before return Statement");
		}
		return 0;
	}
	
	private static void checkVoteEligible(int age) {
		if(age<0)
		{
			throw new IllegalArgumentException("Age Cannot be Negative");
		}
		else if(age>=0 && age<18)
		{
			System.out.println("You are not eligible for voting");
		}
		else
		{
			System.out.println("Eligible for voting");
		}
		
	}
	
	private static void readFile(String fileName) throws IOException
	{
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		System.out.println(bufferedReader.readLine());
		bufferedReader.close();
		
	}
	
	public static void main( String[] args ) throws IOException
	{

		//7.Throws and Throw keyword together
		readFile("./src/main/resources/File1.txt");
		
		
//6.throws keyword		
//		int age = -5;
//		checkVoteEligible(age);
		
		
		
		
//		//6.finally Block
//		System.out.println(testFinallyBlock());
		
		

		
//5.try with resources
//		try(BufferedReader br = new BufferedReader(new FileReader("./src/main/resources/File1.txt"));) {
//			String line = br.readLine();
//			System.out.println(line);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
			
	
//4. Try with multiple catch		
//		try
//		{
//			System.out.println(Integer.parseInt(args[0])/Integer.parseInt(args[1]));
//		}catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("You need to provide 2 numbers");
//		}catch(NumberFormatException e) {
//			System.out.println("You need to provide 2 valid numbers");
//		}catch(ArithmeticException e)
//		{
//			System.out.println("You can't divide a number by 0");
//		}catch(Exception e)
//		{
//			System.out.println("Unknown Exception");
//		}
//	
//		

		
		//3.ClassNotFoundExceptions
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//2.UNCHECKED EXCEPTION
//		try
//		{
//			int[] numArray = {1,2,3,4,5};
//			System.out.println(numArray[4]);
//		}catch(ArrayIndexOutOfBoundsException e)
//		{
//			e.printStackTrace();
//		}
		
		
		//1.CHECKED EXCEPTION
//		File file = new File("./src/main/resources/File1.txt");
//		
//		try {
//			FileReader fileReader = new FileReader(file);
//			try {
//				int ch;
//				while((ch=fileReader.read())!=-1)
//					{
//						System.out.println((char) ch);
//					}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	
}