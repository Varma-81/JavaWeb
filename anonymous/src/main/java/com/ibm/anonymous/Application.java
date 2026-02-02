package com.ibm.anonymous;

public class Application {
	public static void main( String[] args )
	{
		
		
		Greeting greeting = new Greeting() {
			
			@Override
			public void sayHello() {
				System.out.println("Hello,How are you!");
				
			}
		};
		
		greeting.sayHello();
		
		
		
//		Animal animal = new Animal() {
//			@Override
//			public void makeSound() {
//				super.makeSound();
//				System.out.println("Woof Woof");
//			}
//			
//			public void hunting()
//			{
//				System.out.println("Woof is hunting");
//			}
//		};
//		
//		animal.makeSound();
		
		
		
		
//		Thread thread1 = new Thread(new Runnable(){
//			public void run(){
//            	 System.out.println(Thread.currentThread());
//             }
//		 });
//          thread1.start();
//          System.out.println("The End");
	}
}