package patternMatchingAlgo;

public class kmpAlgo {
	
	
	
	public static boolean hasSubString(char [] patternArray, char [] textArray)
	{
		int i=0, j=0, k=0;
		
		while(i < textArray.length && j < patternArray.length)
		{
			if(textArray[i] == patternArray[j])
			{
				i++;
				j++;
			}
			else
			{
				j=0;
				k++;
				i=k;
			}
		}
		
		if(j== patternArray.length)
		return true;
		
		return false;
	}
	
	public static int [] computeTempArray(char[] patternArray)
	{
		int [] lps = new int[patternArray.length];
		
		int j=0;
		
		for (int i = 1; i < patternArray.length;) {
			
			if(patternArray[i] == patternArray[j])
			{
				lps[i] = j +1;
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
					lps[i]=0;
					i++;
				}
			}
		}
		
		return lps;
	}
	
	public static boolean matchPatterUsingkmpAlgo(char[] textArray, char [] patternArray)
	{
		int i=0; int j=0;
		int [] lps = computeTempArray(patternArray);
		
		while(i < textArray.length && j < patternArray.length)
		{
			if(textArray[i] == patternArray[j])
			{
				i++;
				j++;
			}
			else
			{
				if(j!=0)
				{
					j = lps[j-1];
				}
				else
				{
					i++;
				}
			}
		}
		if(j == patternArray.length)
			return true;
			
			return false;
		
	}
	
	public static void main(String[] args) {
		
		
		String t = "abcxabcdabcdabcy";
		String p ="abcdabcy";
		
		
		char[] parray = p.toCharArray();
		char[] tarray = t.toCharArray();
		
		kmpAlgo kmp = new kmpAlgo();
		
		//System.out.println("String matching with BruteForce Algorithm, is Substring present?? And Ans is: " + kmp.hasSubString(parray, tarray));	

		int []  tempArray = kmp.computeTempArray(parray);
		
		for (int i = 0; i < tempArray.length; i++) {
			System.out.print("  " + tempArray[i]);
		}
		System.out.println();
		
		System.out.println("String matching with KMP Algorithm, is Substring present?? And Ans is: " + kmp.matchPatterUsingkmpAlgo(tarray,parray));	
	}

}
