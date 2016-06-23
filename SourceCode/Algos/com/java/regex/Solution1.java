package com.java.regex;

import java.util.regex.Pattern;

public class Solution1 {

	public static void main(String[] args) {
		String text = "This is text to be searched " + 
						"for occurrences of the http:// pattern.";
		
		String pattern =  ".*http://.*";
		boolean isMatch = Pattern.matches(pattern, text);
		System.out.println(isMatch);

	}

}
