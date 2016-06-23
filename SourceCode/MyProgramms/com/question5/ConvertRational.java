package com.question5;

public class ConvertRational {

	public static void main(String[] args) {
		
		System.out.println(getRational(0.125));
		System.out.println(getRational(-0.125));
		System.out.println(getRational(8.9));
		System.out.println(getRational(12.54));
		System.out.println(getRational(34.39));

	}

	public static String getRational(double a)
	{
		int tenPoly = 1;
		
		while(a*tenPoly - (int)(a*tenPoly) != 0)
		{
			tenPoly *=10;
		}
		
		int divident = (int)(a*tenPoly);
		int divisor = tenPoly;
		
		int gcd = 0;
		if(divident>divisor)
			gcd = getGCD(divident, divisor);
		else
			gcd = getGCD(divisor, divident);
		
		divident /= gcd;
		divisor /= gcd;
		
		String result = "Rational value of a = "+ a;
		
		if(divisor<0)
			result +=" is: " + "-"+divident + "/"+(0-divisor);
		else
			result +=" is: " +divident + "/"+divisor;
		
		return result;
	}
	
	private static int getGCD(int a, int b)
	{
		int remainder = a%b;
		if(remainder==0)
			return b;
		else
			return getGCD(b, remainder);
	}
}
