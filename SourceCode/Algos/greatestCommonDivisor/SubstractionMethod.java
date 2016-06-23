package greatestCommonDivisor;

public class SubstractionMethod {

	
	public static int findGreatestCommonDivisor(int m, int n)
	{
		int t= m>n?n:m;
		int mod=0;
		while(t!=0)
		{
			if((m%t)==0 && (n%t)==0)
			{
				break;
			}
			else
			{
				t--;
			}
		}
		
		return t;
	}
	
	
	public static void main(String[] args) {

		int result =  findGreatestCommonDivisor(60, 24);
		
		System.out.println("Final result is :: "+ result);
	}

}
