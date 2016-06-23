package dynamicProgramming;

public class Knapsack01ProblemDynamicProgramming {

	public static void main(String[] args) {
		
		int [] wt  = {2,3,4,5};
		int [] val = {3,4,5,6};
		
		int W = 10;
		int n = wt.length;
		
		int resultFinal = knapSackIterative(W, wt, val, n);
		
		System.out.println("Final Result is :: "+resultFinal);
	}

	
	public static int knapSackIterative(int W, int [] wt, int [] val, int n)
	{
		int [][] K = new int [n+1][W+1];
		
		
		for (int i = 0; i <= n; i++) {
			
			for (int w = 0; w <= W; w++) {
				
				//Base Case
				if(i==0 || w==0)
				K[i][w]= 0;
				
				// If weight of nth item is greater than W exclude that item
				else if(wt[i-1]>w)
					K[i][w] = K[i-1][w];

				else K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]], K[i-1][w]);
				
			}
		}
		
		return K[n][W];
	}
	
	public static int max(int x, int y)
	{
		return x>y?x:y;
	}
}
