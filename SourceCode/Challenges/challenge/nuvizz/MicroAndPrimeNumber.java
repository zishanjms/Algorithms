package challenge.nuvizz;

import java.util.Scanner;

public class MicroAndPrimeNumber {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0; t<T; t++)
		{
			int L = sc.nextInt();
			int R = sc.nextInt();
			
			System.out.println(primePrimeNumber(L, R));
		}

	}
	
	public static int primePrimeNumber(int L, int R)
	{
		boolean[] primeNumberList = getPrimeNumberList(R);
		int counter = 0;
		int currentPrimeCount = getNumberofPrimeNumber(L-1, primeNumberList);
		for(int i=L; i<=R; i++)
		{
			if(primeNumberList[i] )
			{
				++currentPrimeCount;
			}
			
			if(primeNumberList[currentPrimeCount])
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	public static int getNumberofPrimeNumber(int N, boolean[] primeNumberList)
	{
		int counter = 0;
		for (int j = 1; j <= N; j++)
		{
			if(primeNumberList[j]) counter++;
		}

		return counter;
	}

	public static boolean[] getPrimeNumberList(int N)
	{
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
		
		return arr;
	}
}
