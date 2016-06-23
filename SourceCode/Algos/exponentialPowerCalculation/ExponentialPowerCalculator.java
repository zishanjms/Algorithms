package exponentialPowerCalculation;

public class ExponentialPowerCalculator {

	static int counter=0;
	
	public static void main(String[] args) {

		int x = 2;
		// we have to calculate x to the power of n
		int n = 12;

		System.out.println("Final Result bruteForcePower is "+ bruteForcePower(x, n)+" Run time counter "+counter);
		
		System.out.println("Final Result divideByHalfPower is "+ divideByHalfPower(x, n)+" Run time counter "+counter);
		counter=0;
		System.out.println("Final Result divideByHalfPower is "+ recursivePower(x, n)+" Run time counter "+counter);

	}

	// calculate x to the power of n in O(n)
	public static int bruteForcePower(int x, int n)
	{
		counter=0;
		int result =1;
		while(n>0)
		{
			result = result*x;
			n--;
			counter++;
		}
		
		return result;
	}
	
	
	public static int divideByHalfPower(int x, int n)
	{
		counter=0;
		int result =1;
		int k = 0;
		

		if(n%2==0) // n is even
		{
			k=n/2;
			result=1;
			for (int i = 0; i < k; i++) {
				
				result = result * x*x;
				counter++;
			}
		}
		else
		{
			k = (n-1)/2;
			result=x;
			for (int i = 0; i < k; i++) {
				
				result = result * x*x;
				counter++;
			}
		}
		return result;
	}
	
	public static int recursivePower(int x, int n)
	{
		counter++;
		if(n==0)
		return 1;
		if(n==1)
		return x;
		
		if(n%2==0)
			return recursivePower(x*x, n/2);
		else
			return x*recursivePower(x*x, (n-1)/2);
	}
	
}
