package greatestCommonDivisor;

public class EuclidsGCD {

	
	
	public static int findGreatestCommonDivisor(int m, int n)
	{
		int remainder=0;
		while(n!=0)
		{
			remainder = m%n;
			m  = n;
			n = remainder;
			
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		
		int result = findGreatestCommonDivisor(24524544, 345243);
		
		System.out.println("final Results is :: "+ result);
	}

}
