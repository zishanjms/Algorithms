package findListOfPrimeNumber;

import java.util.*;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		
		/*int n=25;
		boolean []arr = new boolean[n];
		
		for(int i=2;i<n;i++)
		{
			arr[i]=true;
		}

		printArray(arr);
		
		int sqrtOfN = new Double(Math.sqrt(n)).intValue();
		
		for(int i=2; i<=sqrtOfN; i++)
		{
			if(arr[i]==true)
			{
				for(int j=i*i;j<n;j=j+i)
				{
					arr[j]=false;
				}
				printArray(arr);
			}
		}
		
		printArray(arr);*/
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++){
			int M = sc.nextInt();
			int N = sc.nextInt();
			boolean[] arr = new boolean[N+1];
			for(int i=2; i<=N; i++){
				arr[i] = true;
			}
 
			int sqr = new Double(Math.sqrt(N)).intValue();
			for(int i=2; i<=sqr; i++){
				if(arr[i]){
					for(int j=i*i; j<=N; j+=i){
						arr[j] = false;
					}
				}
			}
 
			for(int i=M; i<=N; i++){
				if(arr[i]) System.out.println(i);
			}
		}
		
	}
	
	public static void printArray(boolean arr[])
	{
		System.out.println("");
		for(int i=2;i<arr.length;i++)
		{
			if(arr[i]==true)
			{
				System.out.print(" "+i);
			}
			else
				System.out.print("  ");
		}
	}

}
