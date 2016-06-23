package multiThread;

public class PrintEvenOddTesterBad {



    public static void main(String ... args){
        Printer print = new Printer(false);
        Thread t1 = new Thread(new TaskEvenOdd(print));
        Thread t2 = new Thread(new TaskEvenOdd(print));
        t1.start();
        t2.start();
    }


}



class TaskEvenOdd implements Runnable {

    int number=1;
    Printer print;

    TaskEvenOdd(Printer print){
        this.print = print;
    }

    @Override
    public void run() {

        System.out.println("Run method");
        while(number<10){

            if(number%2 == 0){
                System.out.println("Number is :"+ number);
                print.printEven(number);
                number+=2;
            }
            else {
                System.out.println("Number is :"+ number);
                print.printOdd(number);
                number+=2;
            }
        }

      }

    }

class Printer {

    boolean isOdd;

    Printer(boolean isOdd){
        this.isOdd = isOdd;
    }

    synchronized void printEven(int number) {

        while(isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even:"+number);
        isOdd = true;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while(!isOdd){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd:"+number);
        isOdd = false;
        notifyAll();
    }

}