package com.ibm.threads;

import java.util.Date;

public class Task implements Runnable{
	int count;
	public Task(int count) {
		this.count=count;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+"----->"+count);
//		System.out.println(new Date());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
