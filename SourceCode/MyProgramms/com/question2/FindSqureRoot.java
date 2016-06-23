package com.question2;

public class FindSqureRoot {

	public static void main(String[] args) {
		System.out.println("Square root of: "+squreRootByDivideAndConquer(4));
		System.out.println("Square root of: "+squreRootByDivideAndConquer(50));
		System.out.println("Square root of: "+squreRootByDivideAndConquer(20));
		System.out.println("Square root of: "+squreRootByDivideAndConquer(-1));
		System.out.println("Square root of: "+squreRootByDivideAndConquer(0));
		System.out.println("Square root of: "+squreRootByDivideAndConquer(0.2));
		System.out.println("Square root of: "+squreRootByDivideAndConquer(99));

	}
	
	public static double squreRootByDivideAndConquer(double a)
	{
		if(a<0)
		return -1;
		
		if(a==0 || a==1)
			return a;
		
		double precision = 0.00001;
		double start = 0;
		double end = a;
		
		if(a<1)
		  end = 1;
		
		while((end-start)>precision)
		{
			double mid = (start+end)/2;
			double midSqr = mid*mid;
			if(midSqr == a) return mid;
			else if(midSqr<a) start = mid;
			else end = mid;
		}
	
		return (start+end)/2;
	}

}
