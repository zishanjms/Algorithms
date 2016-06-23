package com.question3;

public class NumberOfOccurrence {

	public static void main(String[] args) {
		
		int[] inputArray = {0,0,0,1,1,1,2,2,2,2,2,2,2,4,4,4,4,4,6,6,6,6,6,6,6,6,6,6,7,7,7,7,7,8,8,8,9,9,9,9,16,16,16,16,16,16,16};
		
		System.out.println("Occurrence of Number 2 is: "+getOccurrence(2, inputArray, 0, inputArray.length-1));
		System.out.println("Occurrence of Number 4 is: "+getOccurrence(4, inputArray, 0, inputArray.length-1));
		System.out.println("Occurrence of Number 6 is: "+getOccurrence(6, inputArray, 0, inputArray.length-1));
		System.out.println("Occurrence of Number 5 is: "+getOccurrence(5, inputArray, 0, inputArray.length-1));
		System.out.println("Occurrence of Number 16 is: "+getOccurrence(16, inputArray, 0, inputArray.length-1));

	}

	
	public static int getOccurrence(int k, int[] numbers, int start, int end)
	{
		//Base Case for Recursion termination
		if(end<start)
		  return 0;
		
		if(numbers[start]>k)
			return 0;
		if(numbers[end]<k)
			return 0;
		if(numbers[start]==k && numbers[end]==k)
			return end-start+1;
		
		int mid = (start+end)/2;
		
		if(numbers[mid] == k)
			return 1 + getOccurrence(k, numbers, start, mid-1) + getOccurrence(k, numbers, mid+1, end);
		else if(numbers[mid]>k)
			return getOccurrence(k, numbers, start, mid-1);
		else 
			return getOccurrence(k, numbers, mid+1, end);
		
	}
}
