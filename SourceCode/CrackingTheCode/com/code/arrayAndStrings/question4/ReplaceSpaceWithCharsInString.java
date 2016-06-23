package com.code.arrayAndStrings.question4;


/*Write a method to replace all spaces in a string with'%20'. You may assume that
the string has sufficient space at the end of the string to hold the additional
characters, and that you are given the "true" length of the string.
 (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
EXAMPLE
Input: "Mr John Smith	  "
Output: "Mr%20Dohn%20Smith"*/
public class ReplaceSpaceWithCharsInString {

	public static void main(String[] args) {
	
		String str = "Mr John Smith";
		System.out.println("Result String is: "+ replaceSpacesInString(str));
		

	}

	public static String replaceSpacesInString(String str)
	{
		char[] charArray = str.toCharArray();
		int spaceCounter=0;
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i]==' ')
				spaceCounter++;
			
		}
		int length = charArray.length;
		int newLength = spaceCounter *2 + length;
		char[] newCharArray = new char[newLength];
		
		for (int i = length-1; i >= 0; i--) {
			
			if(charArray[i]==' ')
			{
				newCharArray[newLength-1] = '0';
				newCharArray[newLength-2] = '2';
				newCharArray[newLength-3] = '%';
				newLength = newLength-3;
			}
			else
			{
				newCharArray[newLength-1] = charArray[i];
				newLength = newLength - 1;
			}
		}
		
		return new String(newCharArray);
	}
	
}
