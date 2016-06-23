package com.geeksforgeeks.divideAndConquer;

public class CalculateMean {

	public static void main(String[] args) {
		
		int ar1[] = {1, 5, 7, 10, 13};
		int ar2[] = {11, 15, 23, 30, 45};
		
		if(ar1.length != ar2.length)
			System.out.println("Both Array Lenght should be same");
		
		/*int bruteForceResult = getMedianByBruteForce(ar1, ar2);
		System.out.println("Result is: "+ bruteForceResult);*/

		/*int comparingMedianOfTwoArraysResult = getMedianByComparingMedianOfTwoArrays(ar1, ar2, ar1.length);
		System.out.println("Result is: "+ comparingMedianOfTwoArraysResult);*/
		
		int medianByBinarySearchResult = getMedianByBinarySearch(ar1, ar2, 0, ar1.length);
		System.out.println("Result is: "+ medianByBinarySearchResult);
		
	}
	
	public static int getMedianByBinarySearch(int[] ar1, int[] ar2, int left, int right)
	{
		int n = ar1.length;
		
		if(left>right)
			return getMedianByBinarySearch(ar2, ar1, 0, n);
		
		int i = (left+right)/2;
		int j = n-i-1;
		
		if((ar1[i]>ar2[j]) && (j==n-1 || ar1[i]<=ar2[j+1]))
		{
			if(i==0 || ar2[j]>ar1[i-1])
				return (ar1[i] + ar2[j])/2;
			else
				return (ar1[i]+ar1[i-1])/2;
		}
		
		else if(ar1[i]>ar2[j] && j != (n-1) && ar1[i]>ar2[j-1])
			return getMedianByBinarySearch(ar1, ar2, left, i-1);
		
		else return getMedianByBinarySearch(ar1, ar2, i+1, right);
	}
	
	public static int getMedian(int ar[])
	{
		int n = ar.length;
		
		if(n%2==0)
		 return (ar[n/2] + ar[n/2-1])/2;
		else
			return ar[n/2];
	}
	
	public static int[] copyArrayElementsToNewArray(int[] arr, int start, int end)
	{
		int[] newArray = new int[end-start];
		
		int j=0;
		for (int i = start; i < end; i++,j++) {
			newArray[j] = arr[i];
		}
		
		return newArray;
	}
	
	public static int getMedianByComparingMedianOfTwoArrays(int[] ar1, int[] ar2, int n)
	{
		int m1,m2;
		
		if(n<=0)
			return -1;
		
		if(n==1)
		return (ar1[0]+ar2[0])/2;
		
		if(n==2)
		return (Math.max(ar1[0], ar2[0]) + Math.min(ar1[1], ar2[1]))/2;	
		
		m1 = getMedian(ar1);
		m2 = getMedian(ar2);
		
		if(m1==m2)
			return m1;
		else if(m1<m2)
		{
			if(n%2==0)
			{
				int[] newAr1 = copyArrayElementsToNewArray(ar1, n-(n/2)-1, n);
				int[] newAr2 = copyArrayElementsToNewArray(ar2, 0, n-(n/2)+1);
				return getMedianByComparingMedianOfTwoArrays(newAr1, newAr2, n-(n/2)+1);
			}
			else
			{
				int[] newAr1 = copyArrayElementsToNewArray(ar1, (n/2), n);
				int[] newAr2 = copyArrayElementsToNewArray(ar2, 0, n-(n/2));
				return getMedianByComparingMedianOfTwoArrays(newAr1, newAr2, n-(n/2));
			}
		}
		else
		{
			if(n%2==0)
			{
				int[] newAr1 = copyArrayElementsToNewArray(ar1, 0, n-(n/2)+1);
				int[] newAr2 = copyArrayElementsToNewArray(ar2, n-(n/2)-1, n);
				return getMedianByComparingMedianOfTwoArrays(newAr1, newAr2, n-(n/2)+1);
			}
			else
			{
				int[] newAr1 = copyArrayElementsToNewArray(ar1, 0, n/2);
				int[] newAr2 = copyArrayElementsToNewArray(ar2, n/2, n);
				return getMedianByComparingMedianOfTwoArrays(newAr1, newAr2, n/2);
			}
		}
		
	}

	
	public static int getMedianByBruteForce(int[] ar1, int[] ar2)
	{
		int m1=-1, m2=-1;
		int counter=0;
		int i=0,j=0;
		int n= ar1.length;
		
		for (counter = 0; counter <= n; counter++) {
		
			if(i == n)
			{
				m1 = m2;
				m2 = ar1[0];
				break;
			}
			
			else if(j == n)
			{
				m1 = m2;
				m2 = ar2[0];
				break;
			}
			
			if(ar1[i] < ar2[j])
			{
				m1 = m2;
				m2 = ar1[i];
				i++;
			}
			else
			{
				m1 = m2;
				m2 = ar2[j];
				j++;
			}
			
		}
		
		
		return (m1+m2)/2;
	}
	
}
