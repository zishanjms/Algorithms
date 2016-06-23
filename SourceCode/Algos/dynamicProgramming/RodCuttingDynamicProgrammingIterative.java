package dynamicProgramming;

public class RodCuttingDynamicProgrammingIterative {

	public static void main(String[] args) {

		int [] valueArray ={1,5,8,9,10,17,17,20};
		
		int result =  findMaxProfitForCuttingRod(valueArray);
		
		System.out.println("final result :: "+result);
	}

	
	public static int findMaxProfitForCuttingRod(int [] valueArray)
	{
		
		int [] resultArray = new int[valueArray.length];
		int [] sol = new int[valueArray.length];
		int [] mysol = new int[valueArray.length];
		
		resultArray[0] = valueArray[0];
		for (int i = 1; i < valueArray.length; i++) {
			
			
			for (int k = 0; k < mysol.length; k++) {
				mysol[i] =-1;
			}
			
			resultArray[i]=-1;
			for (int k = 0; k < mysol.length; k++) {
				
				if(k<i)
				{
					sol[k] = resultArray[i-(k+1)];
					mysol[k] = valueArray[k] + sol[k];
				}
				
				if(k==i)
				{
					mysol[k] = valueArray[k];
				}
			}
			
			for (int k = 0; k < mysol.length; k++) {
				
				if(mysol[k]>0)
				{
					if(resultArray[i]==-1 || resultArray[i]<mysol[k])
					{
						resultArray[i] = mysol[k];
					}
				}
				
			}
			
		}
		
		int maxProfit =resultArray[0];
		for (int i = 0; i < resultArray.length; i++) {
			
			System.out.println("resultArray Elements: "+(i+1)+"  :: "+resultArray[i]);
			
			if(maxProfit<resultArray[i])
			{
				maxProfit = resultArray[i];
			}
			
		}
		
		return maxProfit;
	}
}
