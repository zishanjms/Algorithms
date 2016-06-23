package dynamicProgramming;

public class MatrixChainMultiplicationDynamicProgrammingIterative {

	public static void main(String[] args) {
		
		int [] P = {4,10,3,12,20,7};
		
		int result =  findMinCostOfMatrixChainMultiplication(P);
		
		System.out.println("Final Result is:: "+ result);

	}

	public static int findMinCostOfMatrixChainMultiplication(int [] P)
	{
		int n = P.length;
		int [][] solArray = new int [n][n];
		int j=0, sol;
		
		for (int i = 0; i <n; i++) {
			
			solArray[i][i]=0;
		}
				
		for (int cl = 2; cl <n; cl++) {
			
		for (int i = 1 ; i <n-cl+1; i++) {
			
			j=i+cl-1;
			solArray[i][j] =Integer.MAX_VALUE;
			for (int k = i; k <j; k++) {
				
				sol = solArray[i][k] + solArray[k+1][j] + P[i-1]*P[k]*P[j];
				
				if(sol < solArray[i][j])
					solArray[i][j] = sol;
			}
			
		}
		}
		
		return solArray[1][n-1];
	}
}
