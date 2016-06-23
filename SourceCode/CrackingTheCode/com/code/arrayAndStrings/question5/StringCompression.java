package com.code.arrayAndStrings.question5;


/*Implement a method to perform basic string compression using the counts
of repeated characters. For example, the string aabcccccaaa would become
a2blc5a3. If the "compressed" string would not become smaller than
 the original string, your method should return the original string.*/
public class StringCompression {

	public static void main(String[] args) {
		String str = "1234567890";
		
		System.out.println("Compressed String is: " + stringCompression(str));

	}

	public static String stringCompression(String str)
	{
		char[] charArray = str.toCharArray();
		char currentChar = charArray[0];
		int charCounter = 1;
		StringBuilder newStr = new StringBuilder();
		
		for (int i = 1; i < charArray.length; i++) {
			
			if(charArray[i]==currentChar)
				charCounter++;
			else
			{
				newStr.append(currentChar).append(charCounter);
				currentChar = charArray[i];
				charCounter = 1;
				
			}
		}
		
		newStr.append(currentChar).append(charCounter);
		
		if(newStr.length()>str.length())
			return str;
		
		return new String(newStr);
	}
	
}
