package com.code.hard;

public class AddWithPlusSign {

	public static void main(String[] args) {
		int a = 727;
		int b = 645;
		int sum = a+b;
		System.out.println("Original Ans: "+ sum);
		System.out.println( "Addition without plus Sign " + add(a, b));
	}

	public static int add(int a, int b)
	{
		if(b==0) return a;
		int sum = a^b;
		int carry = (a&b)<<1;
		return add(sum, carry);
	}
}
