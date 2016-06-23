package multiThread;


public class CountSubroutine {

	
	
	public static void main(String[] args) throws InterruptedException {
		/*ExecutorService myThreadService = Executors.newFixedThreadPool(5);
		MyThread mythread = new MyThread();
		myThreadService.submit(mythread);*/
		
		MyThread mythread1 = new MyThread();
		mythread1.start();
		
		MyThread mythread2 = new MyThread();
		mythread2.start();
		
		MyThread mythread3 = new MyThread();
		mythread3.start();

		
		
		Thread.sleep(10000);
	}
	
	
	
	
}

class MyThread extends Thread{
	static int counter=0;
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread Id: "+ Thread.currentThread().getId());
			counter++;
			System.out.println("Thread Counter"+ counter);
		}
		
		for (int i = 0; i < 100; i++) {
			
		}
		
		}
		
}



