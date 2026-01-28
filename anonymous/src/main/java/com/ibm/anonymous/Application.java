package com.ibm.anonymous;

public class Application {
	public static void main( String[] args )
	{
		Thread thread1 = new Thread(new Runnable(){
			public void run(){
            	 System.out.println(Thread.currentThread());
             }
		 });
          thread1.start();
          System.out.println("The End");
	}
}