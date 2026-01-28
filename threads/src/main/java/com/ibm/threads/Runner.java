package com.ibm.threads;

class Runner implements Runnable
{
	public void run()
	{
		System.out.println("The current thread is "+Thread.currentThread());
		try
		{
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

//Runner runner = new Runner();
//Thread producer = new Thread(runner,"Producer");
//Thread consumer = new Thread(runner,"Consumer");
//
////System.out.println(producer);
////System.out.println(producer.getState());
//
//producer.start();
//consumer.start();
//
//try 
//{
////	Thread.sleep(1000);
//	producer.join();
//	consumer.join();
//}catch(InterruptedException e)
//{
//	e.printStackTrace();
//}
//
//System.out.println(producer.getState());
//System.out.println(consumer.getState());
//System.out.println("The End");