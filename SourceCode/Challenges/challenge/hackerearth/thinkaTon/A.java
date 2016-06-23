package challenge.hackerearth.thinkaTon;

public class A extends Thread
{   public void run()
{
    while(true)
    {
        long threadId = Thread.currentThread().getId();
        System.out.println("Hello World ! " +threadId );
            //Sleep for sometime
    }
}
public void doSomething()
{
this.start();
}
public static void main(String s[])
{
    A a = new A();
    a.start();
    a.doSomething();
}
}