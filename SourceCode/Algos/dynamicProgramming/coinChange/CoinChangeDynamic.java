package dynamicProgramming.coinChange;

public class CoinChangeDynamic {

	public static void main(String[] args) {
	
		
		int [] values = {1,2,3};
		
		int P=10;
		
		int result = coinChangeDyn(values, P);
		
		System.out.println("Final Result is: "+ result);

	}

	
	public static int coinChangeDyn(int[] values, int P)
	{
		int n= values.length;
		int[] coins= new int[P+1];
		int[] soln = new int[n];
		
		
		for (int i = 1; i <= P; i++) {
			
			for (int j = 0; j < soln.length; j++) {
				soln[j] = -1;
			}
			
			int temp=0;
			for (int j = 0; j < values.length; j++) {
				
				if(values[j]<=i)
				{
					temp = coins[i - values[j]];
					soln[j] = temp +1;
				}
				
			}
			coins[i] =-1;
			for (int j = 0; j < soln.length; j++) {
				
				if(soln[j] > 0)
				{
					if(coins[i]==-1 || soln[j] < coins[i])
					{
						coins[i] = soln[j];
					}
				}
			}
			
		}
		
		return coins[P];
	}
}
