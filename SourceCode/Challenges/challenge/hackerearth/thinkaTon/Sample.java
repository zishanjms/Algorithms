package challenge.hackerearth.thinkaTon;

public class Sample {

	public Sample()
    {
        System.out.println ("Printing one");
        return;
    }

    public Sample(String str)
    {
        this();
        System.out.println (str);
        return;
    }

    public static void main(String[] args)
    {
        Sample sample = new Sample("This is a test");
    }
}
