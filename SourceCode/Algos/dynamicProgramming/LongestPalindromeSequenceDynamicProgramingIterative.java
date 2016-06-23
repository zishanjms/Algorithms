package dynamicProgramming;

public class LongestPalindromeSequenceDynamicProgramingIterative
{

	public static int count=0;
	public static void main(String[] args)
	{
		
		//char[] valueArray = { 'P', 'A', 'Y', 'B', 'Z', 'B', 'A' };

		char [] valueArray = {'A','B'};
 		int result = findLongestPalindromeSequence(valueArray);
		System.out.println("Final Result is:: " + result);
		System.out.println("count :: "+count);
	}

	public static int findLongestPalindromeSequence(char[] valueArray)
	{
		int n = valueArray.length;
		int j;
		int[][] solArray = new int[n][n];

		
		for (int i = 0; i <n; i++) {
			
			solArray[i][i] =1;
		}
		
		
		for (int cl = 2; cl<=n; cl++)      // this is the length of chain we are considering
		{
			for (int i = 0; i<n-cl+1; i++)   //start at i
			{
				count++;
				j = i+cl-1;					  //end at j
				System.out.println("Value of I: "+i + " & Value of j: "+j);
				if (valueArray[i] == valueArray[j] && cl==2)   //if only 2 characters and they are the same then set L[i][j] = 2
				{
					solArray[i][j] = 2;
				}
				else if (valueArray[i] == valueArray[j])  //if greater than length 2 and first and last characters match, add 2 to the calculated value of the center stripped of both ends
				{
						solArray[i][j] = solArray[i + 1][j - 1] + 2;
				}
				else
				solArray[i][j] = max(solArray[i + 1][j],solArray[i][j - 1]);  //if not match, then take max of 2 possibilities
			}
		
		}
		

		return solArray[0][n-1];
	}
	
/*	public static int lps(char [] str)
	{
	   int n = str.length;
	   int i, j, cl;
	   int L[][] = new int[n][n];  // Create a table to store results of subproblems
	 
	 
	   // Strings of length 1 are palindrome of lentgh 1
	   for (i = 0; i < n; i++)
	      L[i][i] = 1;
	 
	    // Build the table. Note that the lower diagonal values of table are
	    // useless and not filled in the process. The values are filled in a
	    // manner similar to Matrix Chain Multiplication DP solution (See
	    // http://www.geeksforgeeks.org/archives/15553). cl is length of
	    // substring
	    for (cl=2; cl<=n; cl++)
	    {
	        for (i=0; i<n-cl+1; i++)
	        {
	        	
	            j = i+cl-1;
	            if (str[i] == str[j] && cl == 2)
	               L[i][j] = 2;
	            else if (str[i] == str[j])
	               L[i][j] = L[i+1][j-1] + 2;
	            else
	               L[i][j] = max(L[i][j-1], L[i+1][j]);
	            
	            System.out.print("value of outerloop variable  cl :: "+cl);
	        	System.out.print("  value of innerloop variable i:: "+i);
	        	System.out.print(" value of j :: "+j);
	        	System.out.print(" value of str[i] ::" + str[i]);
	        	System.out.print(" value of str[j] ::" + str[j]);
	        	System.out.print(" value of L[i][j] :: "+L[i][j]);
	        	System.out.print(" value of L[i+1][j-1] :: "+L[i+1][j-1]);
	        	System.out.print(" value of L[i][j-1] :: "+L[i][j-1]);
	        	System.out.println(" value of  L[i+1][j] :: "+ L[i+1][j]);
	        }
	    }
	 
	    return L[0][n-1];
	}
*/
	public static int max(int x, int y)
	{
		return x > y ? x : y;
	}
}
