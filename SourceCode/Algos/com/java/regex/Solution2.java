package com.java.regex;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution2 {

	public static void main(String[] args) {
	/*	String text    =
		        "This is the text which is to be searched " +
		        "for occurrences of the word 'is'.";

		String patternString = "is";
		
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(text);
		int count = 0;
		while(matcher.find())
		{
			count++;
			
			System.out.println("count : "+ count + " start: " + matcher.start() + " end: " + matcher.end());
		}*/

		double d = 10000000d;
		
		BigDecimal bigD = new BigDecimal(d);
		
		System.out.println(bigD);
	}

}
