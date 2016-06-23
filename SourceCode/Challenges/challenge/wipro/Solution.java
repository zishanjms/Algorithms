package challenge.wipro;


	public class Solution implements Runnable {
		
		 public void run() {
		        System.out.print("h");
		    }

		    public static void main(String arg[]) {
		        Thread t = new Thread();
		        t.run();
		        t.run();
		        t.start();
		         
		    }
		    
		/*private static void hacker() {
	        System.out.print("hack");
	    }
		
	    public static void main(String[] args) throws InterruptedException {
	    	Thread.sleep(5);
	    	hacker();
	        Thread a = new Thread(new Solution());
	        a.setPriority(Thread.MAX_PRIORITY);
	        a.start();

	        Thread.sleep(1);

	        System.out.print("Begin");
	        a.join();
	        System.out.print("End");
	    }

	    public void run() {
	        System.out.print("Run");
	    }*/
	}


