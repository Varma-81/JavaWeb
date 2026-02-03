package com.ibm.thread;

public class Thread1 extends Thread {
	
	public void run()
	{
		System.out.println(getState());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
