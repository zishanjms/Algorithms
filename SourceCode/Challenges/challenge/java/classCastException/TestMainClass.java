package challenge.java.classCastException;


public class TestMainClass extends TestAbstractClass implements TestInterface
{

	public static void main(String[] args) {
		TestInterface test  = new TestMainClass();
		
		try {
			test.push();
			
			if(test instanceof TestAbstractClass)
			{
				System.out.println("test is an instance of TestAbstractClass");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void push() throws InterruptedException {
		System.out.println("In Push Method");
		
	}

	@Override
	public String pop() throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

}
