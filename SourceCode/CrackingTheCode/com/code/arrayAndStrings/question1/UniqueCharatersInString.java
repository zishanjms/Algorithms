package com.code.arrayAndStrings.question1;

import java.util.Arrays;

/*
Implement an algorithm to determine if a string has all unique characters.What
if you cannot use additional data structures?*/

/*Question should be asked:
	1. Character types in string like ascii or unicode
	2. */

public class UniqueCharatersInString {

	public static void main(String[] args) {
		String str = "123456789o0";
		
		System.out.println("Result of checkUniqueCharsWithBuffer " + checkUniqueCharsWithBuffer(str));
		
		System.out.println("Result of checkUniqueCharsWithoutBuffer " + checkUniqueCharsWithoutBuffer(str));
	}
	
	public static boolean checkUniqueCharsWithBuffer(String str)
	{
		//Base case to check string length should not be greater than 256, which is ascii char limit
		if(str.length()>256)
			return false;
		
		char[] charArray = str.toCharArray();
		//temp buffer
		boolean[] letters = new boolean[256];
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(letters[charArray[i]])
				return false;
			else
				letters[charArray[i]] = true;
		}
		
		return true;
		
 	}
	
	public static boolean checkUniqueCharsWithoutBuffer(String str)
	{
		//Base case to check string length should not be greater than 256, which is ascii char limit
		if(str.length()>256)
		   return false;
		
		char[] charArray = str.toCharArray();
		// Sort the charArray
		Arrays.sort(charArray);
		
		for (int i = 1; i < charArray.length; i++) {
			if(charArray[i-1] == charArray[i])
				return false;
		}
		return true;
 	}

}
