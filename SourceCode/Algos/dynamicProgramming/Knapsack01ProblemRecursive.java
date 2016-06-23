package dynamicProgramming;

public class Knapsack01ProblemRecursive {

	public static void main(String[] args) {
		
		int [] wt  = {2,3,4,5};
		int [] val = {3,4,5,6};
		
		int W = 5;
		int n = wt.length;
		
		int resultFinal = knapSackRecursion(W, wt, val, n);
		
		System.out.println("Final Result is :: "+resultFinal);
	}

	
	public static int knapSackRecursion(int W, int [] wt, int [] val, int n)
	{
		//Base Case
		if(n==0 || W==0)
			return 0;
		
		// If weight of nth item is greater than W exclude that item
		if(wt[n-1]>W)
			return knapSackRecursion(W, wt, val, n-1);
		
		return max(val[n-1]+knapSackRecursion(W-wt[n-1], wt, val, n), knapSackRecursion(W, wt, val, n-1));

	}
	
	public static int max(int x, int y)
	{
		return x>y?x:y;
	}
}
