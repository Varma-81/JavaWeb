package com.ibm.thread;

public class RunnableDemo implements Runnable {

	RunnableDemo( ) {
	      System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: New");
	   }
	
	@Override
	public void run() {
		System.out.println("Thread:"+Thread.currentThread().getName()+" , "+"State:Running");
		
		for(int i=4;i>0;i--)
		{
			System.out.println("Thread:"+Thread.currentThread().getName()+" , "+i);
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread:"+Thread.currentThread().getName()+" , "+"State:About to Dead....");
	}

}
