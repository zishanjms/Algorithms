package com.code.hard;

public class RandomMInteger {

	public static void main(String[] args) {
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		int[] randomMInteger = getRandomMInteger(arr, 12);
		
		for (int i = 0; i < randomMInteger.length; i++) {
			System.out.print("\t" + randomMInteger[i]);
		}
		

	}

	
	public static int[] getRandomMInteger(int[] arr, int m)
	{
		int[] sol = new int[m];
		for (int i = 0; i < sol.length; i++) 
		{
			sol[i] = arr[i];
		}
		
		for (int i = m; i < arr.length; i++)
		{
			int k = random(0, i);
			if(k<m)
			{
				sol[k] = arr[i];
			}
		}
		
		return sol;
	}
	
	public static int random(int lower, int higher)
	{
		return lower + (int)(Math.random() * (higher -lower + 1));
	}
}
