package com.code.arrayAndStrings.question8;

public class RotatedSubstring {

	public static void main(String[] args) {
		
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		
		String s3 = s1+s1;
		
		System.out.println("isSubString: "+ isSubString(s3, s2));

	}

	public static boolean isSubString(String s1, String s2)
	{
		// Use KMP Algorithm to find pattern in text
		boolean result=false;
		char[] text = s1.toCharArray();
		char[] pattern = s2.toCharArray();
		
		int[] lps = computerTempArray(pattern);

		int i=0, j=0;
		
		while(i<text.length && j<pattern.length)
		{
			if(text[i] == pattern[j])
			{
				i++;
				j++;
			}
			else
			{
				if(j!=0)
				{
					j=lps[j-1];
				}
				else
				{
					i++;
				}
			}
		}
		
		if(j == pattern.length)
			result = true;
		
		return result;
	}
	
	
	public static int[] computerTempArray(char[] pattern)
	{
		int[] lps = new int[pattern.length];
		
		int j=0;
		
		for (int i = 1; i < lps.length;) {
			
			if(pattern[i] == pattern[j])
			{
				lps[i] = j+1;
				j++;
				i++;
			}
			else
			{
				if(j!=0)
				{
					j = lps[j-1];
				}
				else
				{
					lps[i] = 0;
					i++;
				}
			}
		}
		
		return lps;
	}
	
}
