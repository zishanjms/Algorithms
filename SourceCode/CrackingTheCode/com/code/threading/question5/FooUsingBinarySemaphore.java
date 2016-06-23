package com.code.threading.question5;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FooUsingBinarySemaphore {

	Semaphore sem1, sem2, sem3;
	
	public FooUsingBinarySemaphore() throws InterruptedException {
		sem1 = new Semaphore(1);
		sem2 = new Semaphore(1);
		sem3 = new Semaphore(1);
		
		sem1.acquire();
		sem2.acquire();
		sem3.acquire();
	}
	
	public void first(){
		
		try {
			
			for (int i = 0; i < 100; i++) {
				System.out.println("first Method: "+i);
			}
			sem1.release();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void second(){
		try {
				sem1.acquire();
				sem1.release();
			
				for (int i = 0; i < 100; i++) {
					System.out.println("second Method: "+i);
				}
				
				sem2.release();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void third(){
		try {
				sem2.acquire();
				sem2.release();
		
				for (int i = 0; i < 100; i++) {
					System.out.println("third Method: "+i);
				}
			
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		FooUsingBinarySemaphore fooUsingLock = new FooUsingBinarySemaphore();
		MyThread4 myThread4 = new MyThread4(fooUsingLock);
		myThread4.start();
		
		MyThread5 myThread5 = new MyThread5(fooUsingLock);
		myThread5.start();
		
		MyThread6 myThread6 = new MyThread6(fooUsingLock);
		myThread6.start();

		myThread4.join();
		myThread5.join();
		myThread6.join();
		
	}

}

class MyThread4 extends Thread{
	
	private FooUsingBinarySemaphore fooUsingLock;
	
	public MyThread4(FooUsingBinarySemaphore fooUsingLock) {
		this.fooUsingLock = fooUsingLock;
	}

	@Override
	public void run() {
		fooUsingLock.first();
	}
		
}

class MyThread5 extends Thread{
	
	private FooUsingBinarySemaphore fooUsingLock;
	
	public MyThread5(FooUsingBinarySemaphore fooUsingLock) {
		this.fooUsingLock = fooUsingLock;
	}

	@Override
	public void run() {
		fooUsingLock.second();
	}
		
}

class MyThread6 extends Thread{
	
	private FooUsingBinarySemaphore fooUsingLock;
	
	public MyThread6(FooUsingBinarySemaphore fooUsingLock) {
		this.fooUsingLock = fooUsingLock;
	}

	@Override
	public void run() {
		fooUsingLock.third();
	}
		
}
