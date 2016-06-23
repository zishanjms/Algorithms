package multiThread;

public class PrintEvenOddTester {

	public static void main(String[] args) {
		PrinterGood printer = new PrinterGood();
		Thread evenThread = new Thread(new TaskEvenOddGood(100, printer, true));
		Thread oddThread = new Thread(new TaskEvenOddGood(100, printer, false));
		evenThread.start();
		oddThread.start();

	}

}

class TaskEvenOddGood implements Runnable{

	int maxNumber;
	PrinterGood printer;
	boolean isEvenNumber;
	int number;
	
	public TaskEvenOddGood(int number, PrinterGood printer, boolean isEvenNumber) {
		this.maxNumber = number;
		this.printer = printer;
		this.isEvenNumber = isEvenNumber;
		this.number = isEvenNumber?2:1;
	}
	
	@Override
	public void run() {
		while(number<= maxNumber){
			if(isEvenNumber){
				printer.printEven(number);
			}
			else{
				printer.printOdd(number);
			}
			number+=2;
		}
	}
	
}

class PrinterGood{
	
	boolean isOdd = true;
	
	public synchronized void printEven(int number){
		while(isOdd){
		
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		System.out.println("Even: " + number);	
		isOdd = true;
		notify();
	}
	
	public synchronized void printOdd(int number){
		while(!isOdd){
			
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		System.out.println("Odd: " + number);	
		isOdd = false;
		notify();
	}
	
}