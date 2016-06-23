package challenge.marketShare.level1;

import java.util.regex.*;

public class ApproximateMatching {

	public static void main(String[] args) {
		
		//String result = calculateScore("KnothingP", "bruno", "ingenious");
		//System.out.println("Final Result is: " + result);
		String mydata = "nothing";
		String prefix = "bruno";
		String suffix = "ingenious";
		char [] textArray = mydata.toCharArray();
		char[] prefixArray = prefix.toCharArray();
 		int i=0;
		
		
		while(i<mydata.length())
		{
	        
			Pattern pattern = Pattern.compile("*"+textArray[i]+"*");
	
	        Matcher matcher = pattern.matcher(prefix);
	        if(matcher.matches()) {
	            System.out.println(matcher.group(0));
	        }
	        else
	        {
	        	i++;
	        }
		}
	}

	public static String calculateScore(String text, String prefix, String suffix)
	{
		String result="";
		char [] textArray = text.toCharArray();
		char [] prefixArray = prefix.toCharArray();
		char [] suffixArray = suffix.toCharArray();
		
		int lengthOfText = text.length();
		int lenOfPrefix = prefix.length();
		int lenOfSuffix = suffix.length();
		
		int i=0, j=1, start=0, end=0;
		
		
		while(i<lengthOfText && j< lenOfPrefix)
		{
			
		}
		
 		return result;
	}
}
