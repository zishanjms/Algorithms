package anagram;

import java.util.Stack;

public class AllAnagramGenerationAlgo {

	public static void main(String[] args) {
		
		String str = "123";
		
		String abc = "7030*";
		
		//System.out.println("abc" + abc.matches("^.*$"));
		
		char[] charArray = str.toCharArray();
		
		// recursive algo
		generateAllAnagrams(charArray,0);
		
		

	}
	
	
	public static void generateAllAnagrams(char [] charArray, int k)
	{
		int n = charArray.length;
		if(k==n) // base case
		{
			String str1 = new String(charArray);
			System.out.println(str1.toString());
		}
		else
		{
			for (int i = k; i < n; i++) {
				swap(charArray, k, i);
				generateAllAnagrams(charArray, k+1);
				swap(charArray, k, i);
			}
		}
	}
	
	public static void swap(char[] charArray,int k, int i)
	{
		char temp = charArray[i];
		charArray[i] = charArray[k];
		charArray[k] = temp;
	}
}
