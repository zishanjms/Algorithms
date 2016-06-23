package com.code.arrayAndStrings.question3;

import java.util.Arrays;


/*Given two strings, write a method to decide if one is a permutation of the other.*/
public class CheckAnotherStringIsAnagramOfFirst {

	public static void main(String[] args) {
		String str1 = "1234567890";
		String str2 = "1357908642";

		System.out.println("Result of isBothAnagramWithBuffer : "+ isBothAnagramWithBuffer(str1, str2));
		
		System.out.println("Result of isBothAnagramWithoutBuffer : "+ isBothAnagramWithoutBuffer(str1, str2));
	}

	public static boolean isBothAnagramWithBuffer(String str1, String str2)
	{
		// Base Case check length of both string if not matching return false
		if(str1.length()!= str2.length())
			return false;
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		// Buffer Assumption is both string are ascii character strings
		int[] letters = new int[256];
		
		for (int i = 0; i < charArray1.length; i++) {
			letters[charArray1[i]]++;
		}
		
		for (int i = 0; i < charArray2.length; i++) {
			if(--letters[charArray2[i]]<0)
				return false;
		}
		return true;
	}
	
	public static boolean isBothAnagramWithoutBuffer(String str1, String str2)
	{
		// Base Case check length of both string if not matching return false
		if(str1.length()!= str2.length())
			return false;
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
				
		for (int i = 0; i < charArray2.length; i++) {
			if(charArray1[i] != charArray2[i])
				return false;
		}
		return true;
	}
	
}
