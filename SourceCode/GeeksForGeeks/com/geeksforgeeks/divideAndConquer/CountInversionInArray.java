package com.geeksforgeeks.divideAndConquer;


public class CountInversionInArray {

	public static void main(String[] args) {
		int ar1[] = {1, 5, 7, 10, 11, 13, 15, 23, 30, 45};

		/*int result = getInversionCountInArrayUsingBruteForce(ar1);
		System.out.println("Result is :: " +result);*/
		
		int result = getInversionCountInArrayUsingDAC(ar1, 0, ar1.length-1);
		System.out.println("Result is :: " +result);
	}

	
	public static int getInversionCountInArrayUsingDAC(int[] ar, int left, int right)
	{
		int mid,inv_count = 0;
		
		if(right>left)
		{
			mid = (left+right)/2;
			inv_count = getInversionCountInArrayUsingDAC(ar, left, mid);
			inv_count += getInversionCountInArrayUsingDAC(ar, mid+1, right);
			
			
			inv_count += mergeBothArrays(ar,left, right, mid+1);
			
		}
		return inv_count;
	}
	
	public static int mergeBothArrays(int[] ar, int left, int right, int mid)
	{
		int[] temp = new int[ar.length];
		int inv_count = 0;
		int i,j,k;
		
		i = left;
		j = mid;
		k = left;
		
		while(i<=(mid-1) && j<=right)
		{
			if(ar[i]<=ar[j])
			{
				temp[k++] = ar[i++];
			}
			else
			{
				temp[k++] = ar[j++];
				inv_count += (mid -i);
			}
		}
		
		while(i<=(mid-1))
			temp[k++] = ar[i++];
		
		while(j<=right)
			temp[k++] = ar[j++];
		
		for (int k2 = left; k2 <= right; k2++) {
			ar[k2] = temp[k2];
		}
		
		return inv_count;
	}
	
	public static int getInversionCountInArrayUsingBruteForce(int[] ar)
	{
		int inv_count=0;
		
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[i]>ar[j])
					inv_count++;
			}
		}
		
		return inv_count;
	}
	
	
	
}
