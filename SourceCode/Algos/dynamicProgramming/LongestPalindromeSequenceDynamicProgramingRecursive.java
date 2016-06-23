package dynamicProgramming;

public class LongestPalindromeSequenceDynamicProgramingRecursive
{
	public static int count=0;

	public static void main(String[] args)
	{

		String str = "PAYBZBA";
		char[] valueArray = str.toCharArray();
		
		int result = longestPalindrome(valueArray,0,valueArray.length-1);
		System.out.println("Final Result is:: " + result);
		System.out.println("count :: "+count);
	}
	
	
	
	public static int longestPalindrome(char [] valueArray, int i,int j)
	{
		count++;
		if (i == j)
		{
			return 1;
		}
		else if (j==(i + 1))
		{
			if (valueArray[i] == valueArray[j])
			{
				return 2;
			}
			else if (valueArray[i] != valueArray[j])
			{
				return 1;
			}
		}
		else if (valueArray[i] == valueArray[j])
		{
			return longestPalindrome(valueArray,i + 1,j - 1) + 2;
		}
		
		return max(longestPalindrome(valueArray,i + 1,j),longestPalindrome(valueArray,i,j-1));
		
	}

	public static int max(int x, int y)
	{
		return x > y ? x : y;
	}
}
