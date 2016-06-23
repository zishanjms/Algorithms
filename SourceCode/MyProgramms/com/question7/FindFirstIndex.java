package com.question7;

public class FindFirstIndex {

	public static void main(String[] args) {
		
		int [] numbers ={1,1,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,6,7,8,9};
		System.out.println("First Index of Number 3 is: "+getFirstIndex(numbers, 4, 0, numbers.length-1));

	}

	public static int getFirstIndex(int[]numbers, int k, int start, int end)
	{
		if(end<start) return -1;
		
		if(numbers[start]>k)
			return -1;
		
		if(numbers[end]<k)
			return -1;
		
		if(numbers[start]==k) return start;
		
		int mid =(start+end)/2;
		if(numbers[mid]==k)
		{
			int leftIndex = getFirstIndex(numbers, k, start, mid-1);
			return leftIndex==-1?mid:leftIndex;
		}
		else if(numbers[mid]>k)
			  return getFirstIndex(numbers, k, start, mid-1);
		else
			return getFirstIndex(numbers, k, mid+1, end);
	}
	
}
