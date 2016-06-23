package com.code.threading.question5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FooUsingLock {

	Lock lock1;
	Lock lock2;
	Lock lock3;
	
	public FooUsingLock() {
		lock1 = new ReentrantLock();
		lock2 = new ReentrantLock();
		lock3 = new ReentrantLock();
		
		
		lock1.lock();
		lock2.lock();
		lock3.lock();
	}
	
	public void first(){
		
		try {
			
			for (int i = 0; i < 100; i++) {
				System.out.println("first Method: "+i);
			}
			lock1.unlock();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void second(){
		try {
				lock1.lock();
				lock1.unlock();
			
				for (int i = 0; i < 100; i++) {
					System.out.println("second Method: "+i);
				}
				
				lock2.unlock();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void third(){
		try {
				lock2.lock();
				lock2.unlock();
		
				for (int i = 0; i < 100; i++) {
					System.out.println("third Method: "+i);
				}
			
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		FooUsingLock fooUsingLock = new FooUsingLock();
		
		MyThread1 myThread1 = new MyThread1(fooUsingLock);
		myThread1.start();
		
		MyThread2 myThread2 = new MyThread2(fooUsingLock);
		myThread2.start();
		
		MyThread3 myThread3 = new MyThread3(fooUsingLock);
		myThread3.start();

		myThread1.join();
		myThread2.join();
		myThread3.join();
		
	}

}

class MyThread1 extends Thread{
	
	private FooUsingLock fooUsingLock;
	
	public MyThread1(FooUsingLock fooUsingLock) {
		this.fooUsingLock = fooUsingLock;
	}

	@Override
	public void run() {
		fooUsingLock.first();
	}
		
}

class MyThread2 extends Thread{
	
	private FooUsingLock fooUsingLock;
	
	public MyThread2(FooUsingLock fooUsingLock) {
		this.fooUsingLock = fooUsingLock;
	}

	@Override
	public void run() {
		fooUsingLock.second();
	}
		
}

class MyThread3 extends Thread{
	
	private FooUsingLock fooUsingLock;
	
	public MyThread3(FooUsingLock fooUsingLock) {
		this.fooUsingLock = fooUsingLock;
	}

	@Override
	public void run() {
		fooUsingLock.third();
	}
		
}
