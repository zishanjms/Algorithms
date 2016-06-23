package com.question6;

public class AllStringPermutations {

	public static void main(String[] args) {
		printAllStringPermutations("1234".toCharArray(), 0);

	}
	
	public static void printAllStringPermutations(char[] charArray, int currentCharPos)
	{
		int n = charArray.length;
		
		//Base Case 
		if(currentCharPos == n)
		{
			String result = new String(charArray);
			System.out.println(result);
		}
		else
		{
			for(int i = currentCharPos; i<n; i++)
			{
				swapChar(charArray, currentCharPos, i);// Swap Current Char with next char one by one
				printAllStringPermutations(charArray, currentCharPos+1);
				swapChar(charArray, currentCharPos, i);// Revert the swap done by previous method
			}
		}
	}
	
	public static void swapChar(char[] charArray, int stIdx, int endIdx)
	{
		char temp = charArray[stIdx];
		charArray[stIdx] = charArray[endIdx];
		charArray[endIdx] = temp;
	}

}
