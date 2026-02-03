package com.ibm.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Beep...Beep");
	}
	
}

public class Application
{
	public static void main( String[] args ) throws InterruptedException
	{
	
		
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		scheduler.scheduleWithFixedDelay(new MyThread(), 10,5,TimeUnit.SECONDS);
		

		
		
//2.ScheduledAtFixedRate()-scheduled for future		
//		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//		
//		scheduler.scheduleAtFixedRate(new MyThread(), 10,2,TimeUnit.SECONDS);
		
//		scheduler.shutdown();
		
		
		
		
		
//1.Schedule(),One time schedule a task		
//		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//		
//		scheduler.schedule(new MyThread(), 10,2,TimeUnit.SECONDS);
//		
//		scheduler.shutdown();
		
		
		
		
		
		
		
//4.Join
//		Thread t1 = new Thread(new RunnableDemo(),"thread1");
//		Thread t2 = new Thread(new RunnableDemo(),"thread2");
//		Thread t3 = new Thread(new RunnableDemo(),"thread3");
//		
//		System.out.println("Thread 1 Started");
//		t1.start();
//		t1.join(1000);
//		
//		System.out.println("Thread 2 Started");
//		t2.start();
//		t2.join();
//		
//		System.out.println("Thread 3 Started");
//		t3.start();
//		t3.join();
//		
//		System.out.println("Main is About to Terminate");
		
		
		
//3.Implementing runnable interface using lambda
//		Thread thread = new Thread(
//				()-> System.out.println("Thread")
//				);
//		thread.start();
//		System.out.println("Main");
		
		
		
		
		
		
		
		
//2.By Implementing Interface
//		Thread2 thread2 = new Thread2();
//		
//		Thread t1 = new Thread(thread2);
//		
//		t1.run();
		
		
		
//1.By Extends		
//		Thread1 thread1 = new Thread1();
//		System.out.println(thread1.getState());
//		thread1.start();
//		
//		Thread.sleep(1000);
//		System.out.println(thread1.getState());
//		
//		thread1.join();
//		System.out.println(thread1.getState());
		
		
	}
}