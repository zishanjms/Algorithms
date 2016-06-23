package challenge.syncron;

public class EquilibriumIndexInArray {

	public static void main(String[] args)
	{
		int[] arr = {-1, 3, -4, 5,  1, -6, 2, 1};
		printEquilibriumIndexInArray(arr);
	}

	public static void printEquilibriumIndexInArray( int[] arr )
	{
	    // aux array to calculate cumulative Right Sum
	    int[] rightSum = new int[arr.length+1];
	    int rightSumTemp = 0;
	    for( int i=arr.length-1; i >=0; i-- )
	    {
	    	
	    	rightSumTemp += arr[i];
	    	rightSum[i] = rightSumTemp;
	    }
	    
	    int leftSum =0;
	    for( int i=0; i<arr.length; i++)
	    {
	        if(leftSum == rightSum[i+1])
	        {
	            System.out.println("Array Index is Equilibrium Index: " + i);
	        }
	        
	        leftSum += arr[i];
	    }
	}
}
