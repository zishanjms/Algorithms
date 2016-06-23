package combinatorialProblems;

public class FindMaxDiffFromArray {

	public static void main(String[] args) 
	{
		 int arr[] = {80, 2, 6, 3, 100};
		 			//-78,  4, -3,  97
		 			//-78,  4,  1,  98
		 System.out.println(maxDiff(arr));
		System.out.println(maxProfit(arr));
	}

	public static int maxDiff (int arr[])
	{
		int n = arr.length;
	    // Initialize diff, current sum and max sum
	    int diff = arr[1]-arr[0];
	    int curr_sum = diff;
	    int max_sum = curr_sum;
	 
	    for(int i=1; i<n-1; i++)
	    {
	        // Calculate current diff
	        diff = arr[i+1]-arr[i];
	 
	        // Calculate current sum
	        if (curr_sum > 0)
	           curr_sum += diff;
	        else
	           curr_sum = diff;
	 
	        // Update max sum, if needed
	        if (curr_sum > max_sum)
	           max_sum = curr_sum;
	    }
	 
	    return max_sum;
	}
	
	public static int maxProfit(int price[])
	{
		int n = price.length;
	    // Create profit array and initialize it as 0
	    int[] profit = new int[n];
	    for (int i=0; i<n; i++)
	        profit[i] = 0;
	 
	    /* Get the maximum profit with only one transaction
	       allowed. After this loop, profit[i] contains maximum
	       profit from price[i..n-1] using at most one trans. */
	    int max_price = price[n-1];
	    for (int i=n-2;i>=0;i--)
	    {
	        // max_price has maximum of price[i..n-1]
	        if (price[i] > max_price)
	            max_price = price[i];
	 
	        // we can get profit[i] by taking maximum of:
	        // a) previous maximum, i.e., profit[i+1]
	        // b) profit by buying at price[i] and selling at
	        //    max_price
	        profit[i] = Math.max(profit[i+1], max_price-price[i]);
	    }
	 
	    /* Get the maximum profit with two transactions allowed
	       After this loop, profit[n-1] contains the result */
	    int min_price = price[0];
	    for (int i=1; i<n; i++)
	    {
	        // min_price is minimum price in price[0..i]
	        if (price[i] < min_price)
	            min_price = price[i];
	 
	        // Maximum profit is maximum of:
	        // a) previous maximum, i.e., profit[i-1]
	        // b) (Buy, Sell) at (min_price, price[i]) and add
	        //    profit of other trans. stored in profit[i]
	        profit[i] = Math.max(profit[i-1], profit[i] +
	                                    (price[i]-min_price) );
	    }
	    int result = profit[n-1];
	 
	    return result;
	}
}
