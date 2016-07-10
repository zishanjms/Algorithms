package challenge.thoughtworks;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		
		/*boolean[] primeNumberList = findListOfPrimeNumber(5001);
		
		for(int i=0; i<=5000; i++){
			if(primeNumberList[i]){
				System.out.print(i + " ");
			}
		}*/
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		N = N+1;
		int[] arr = new int[N];
		for(int i=1; i<N; i++){
			arr[i] = sc.nextInt();
		}
		
		boolean[] primeNumberList = findListOfPrimeNumber(N);
		System.out.println(getRhezosPoint(arr, primeNumberList));
	}

	public static long getRhezosPoint(int[] arr, boolean[] primeNumberList){
		long result =0;
		int maxPrimeIndex=2;
		for(int i= arr.length-1; i>0; i--){
			if( primeNumberList[i] == true)
			{
				maxPrimeIndex = i;
				break;
			}
		}
		
		for (int i = 1; i <= maxPrimeIndex; i++) {
			result += arr[i];
		}
		
		return result;
	}
	
	public static boolean[] findListOfPrimeNumber(int N){
		boolean[] result = new boolean[N];
		for(int i=1; i<N; i++){
			result[i] = true;
		}
		int sqrRootOfN = (int)Math.sqrt(N);
		
		for(int i=2; i<=sqrRootOfN; i++){
			
			if(result[i])
			{
				int j=i*i;
				
				while(j<N)
				{
					result[j] = false;
					j=j+i;
				}
			}
		}
		
		return result;
	}
}
