package challenge.amazon.sde2;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}

		int S = sc.nextInt();
		System.out.println(getCount(arr, S));
	}
	
	public static int getCount(int[] A, int S){
		int n= A.length;
		int[] coins= new int[S+1];
		int[] soln = new int[n];
		
		
		for (int i = 1; i <= S; i++) {
			
			for (int j = 0; j < soln.length; j++) {
				soln[j] = -1;
			}
			
			int temp=0;
			for (int j = 0; j < A.length; j++) {
				
				if(A[j]<=i)
				{
					temp = coins[i - A[j]];
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
		
		return coins[S];
	}

}
