package dynamicProgramming;

public class MatrixChainMultiplicationDynamicProgrammingRecursive {

	public static void main(String[] args) {
		
		int [] P = {4,10,3,12,20,7};
		int n = P.length;
		
		int result =  findMinCostOfMatrixChainMultiplication(P,1,n-1);
		
		System.out.println("Final Result is:: "+ result);

	}

	public static int findMinCostOfMatrixChainMultiplication(int [] P,int i, int j)
	{
		if(i==j)
		return 0;
		
		int min = 999999999;
		int count;
		
		for (int k = i; k <j; k++) {
			
			
			count = findMinCostOfMatrixChainMultiplication(P, i, k) 
					+ findMinCostOfMatrixChainMultiplication(P, k+1, j)
					+ P[i-1]*P[k]*P[j];
			
			if(count<min)
				min =count;
		}
		
		return min;
	}
	
	
}
