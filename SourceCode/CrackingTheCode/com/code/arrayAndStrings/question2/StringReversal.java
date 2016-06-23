package com.code.arrayAndStrings.question2;


/*Implement a function void reverse(char* str) in C or C++ which reverses a nullterminated string.*/


public class StringReversal {

	public static void main(String[] args) {
		String str = "1234567890";
		System.out.println("Reversal of String: " + str + " is : "+reversal(str));
	}

	public static String reversal(String str)
	{
		char[] charArray = str.toCharArray();
		int i=0;
		int j=str.length()-1;
		
		for (i = 0; i < j; i++,j--) {
			char temp = charArray[j];
			charArray[j] = charArray[i];
			charArray[i] = temp;
		}
		
		return new String(charArray);
	}
	
}
