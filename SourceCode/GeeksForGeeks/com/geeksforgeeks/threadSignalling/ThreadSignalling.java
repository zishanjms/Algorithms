package com.geeksforgeeks.threadSignalling;

public class ThreadSignalling {

	public static void main(String[] args) {
		
		MyThreadSync myThreadSync = new MyThreadSync();
		
		Thread thread1 = new Thread(new EvenThread(2, myThreadSync));
		
		Thread thread2 = new Thread(new OddThread(1, myThreadSync));
		
		thread2.start();
		thread1.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

class MonitorObject 
{
}

class MyThreadSync
{

	private MonitorObject monitorObject = new MonitorObject();
	private boolean wasSignalled = false;
	
	public void doWait()
	{
		synchronized (monitorObject) {
			System.out.println(Thread.currentThread().getName() + " doWait()");
			if(!wasSignalled)
			{
				try {
					monitorObject.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				wasSignalled = false;
			}
			
		}
	}	
	
	public void doNotify()
	{
		synchronized (monitorObject) {
			System.out.println(Thread.currentThread().getName() + " doNotify()");
			wasSignalled = true;
			monitorObject.notify();
		}
	}
	
}


class EvenThread implements Runnable
{
	int counter;
	MyThreadSync myThreadSync;
	public EvenThread(int counter, MyThreadSync myThreadSync)
	{
		this.counter = counter;
		this.myThreadSync = myThreadSync;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			if(counter%2==0)
			{
				System.out.println(counter++);
				myThreadSync.doNotify();
				myThreadSync.doWait();
			}
		}
		
		
		
	}
	
}

class OddThread implements Runnable
{
	int counter;
	MyThreadSync myThreadSync;
	public OddThread(int counter, MyThreadSync myThreadSync)
	{
		this.counter = counter;
		this.myThreadSync = myThreadSync;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			if(counter%2!=0)
			{
				System.out.println(counter++);
				myThreadSync.doNotify();
				myThreadSync.doWait();
			}
		}
		
		
		
	}
	
}