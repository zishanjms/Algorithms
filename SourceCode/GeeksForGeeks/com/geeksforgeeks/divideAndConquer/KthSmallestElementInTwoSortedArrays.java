package com.geeksforgeeks.divideAndConquer;

public class KthSmallestElementInTwoSortedArrays {

	public static void main(String[] args) {
		int ar1[] = {1, 5, 7, 10, 13};
		int ar2[] = {11, 15, 23, 30, 45};

		int kthSmallestElement = getKthSmallestElementFromTwoSortedArrays(ar1, 0, ar1.length-1, ar2, 0, ar2.length-1, 9);
		
		System.out.println("Final Result is: "+ kthSmallestElement);
		
	}

	public static int getKthSmallestElementFromTwoSortedArrays(int[] ar1, int left1, int right1, int[] ar2, int left2, int right2, int k)
	{
		int m = ar1.length;
		int n = ar2.length;
		
		
		
		if(k<=0 || k>(m+n))
			return Integer.MAX_VALUE;
		
		if(left1>right1)
			return getKthSmallestElementFromTwoSortedArrays(ar2, left2, right2, ar1, left1, right1, k);
		
		int i = (left1+right1)/2;
		int j = k-i-1;
		
		if(j<0) // search in left side of ar1
			return getKthSmallestElementFromTwoSortedArrays(ar1, left1, i-1, ar2, left2, right2, k);
		
		else if(j>n)
			return getKthSmallestElementFromTwoSortedArrays(ar1, i+1, right1, ar2, left2, right2, k);
		
		int ar2_j = (j==n)?Integer.MAX_VALUE:ar2[j];
		int ar2_j_1 = (j==0)?Integer.MIN_VALUE:ar2[j-1];
		
		if(ar1[i]>ar2_j_1 && ar1[i] < ar2_j) // match found
			return ar1[i];
		else if(ar1[i]> ar2_j_1 && ar1[i]> ar2_j) // search left
			return getKthSmallestElementFromTwoSortedArrays(ar1, left1, i-1, ar2, left2, right2, k);
		
		else // search in right half
			return getKthSmallestElementFromTwoSortedArrays(ar1, i+1, right1, ar2, left2, right2, k);
	}
	
}
