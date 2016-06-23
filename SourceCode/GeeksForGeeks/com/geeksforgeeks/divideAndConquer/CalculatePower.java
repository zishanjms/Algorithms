package com.geeksforgeeks.divideAndConquer;

public class CalculatePower {
	public static int counter=0;
	public static void main(String[] args) {
		float x=2;
		int y=37;
		
		float result = power(x,y);
		System.out.println("result is: "+result);
		System.out.println("Counter:: "+counter);
	}

	/*Time Complexity of optimized solution: O(logn)
	Let us extend the pow function to work for negative y and float x.*/
	public static float power(float x, int y)
	{
		counter++;
		float temp;
		
		if(y==0)
		return 1;
		
		temp = power(x,y/2);
		if(y%2==0)
		return temp*temp;
		else
		{
			if(y>0)
			return x*temp*temp;
			else
				return (temp*temp)/x;
		}
		
	}
}
