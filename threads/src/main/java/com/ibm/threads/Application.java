package com.ibm.threads;

import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Application
{
	public static void main( String[] args )
	{
//		
//		int vCPUs=Runtime.getRuntime().availableProcessors();
//		System.out.println(vCPUs);
//		ScheduledExecutorService service=Executors.newScheduledThreadPool(vCPUs);
//		
//		System.out.println(new Date());
//		service.schedule(new Task(1), 10, TimeUnit.SECONDS);
//		service.scheduleAtFixedRate(new Task(2), 10,5,TimeUnit.SECONDS);
//		service.scheduleWithFixedDelay(new Task(3),10,5, TimeUnit.SECONDS);//After Task Completes,it re-schedule the task
//		service.shutdown();
		
		
//		ExecutorService service=Executors.newCachedThreadPool();
//		
//		for(int counter=0;counter<10;counter++)
//		{
//			service.submit(new Task(counter));
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("The End");
		
		Thread t = new Thread(()->
		System.out.println("Thread"));
		t.start();
		System.out.println("Main");
		
	
		
		
//		ExecutorService executorService =Executors.newFixedThreadPool(4);
//		
//		for(int counter=0;counter<10;counter++)
//		{
//			System.out.println(executorService.submit(new Task(counter)));
//		}
//		
//		executorService.shutdown();
//		System.out.println("The End");
		
	}
}