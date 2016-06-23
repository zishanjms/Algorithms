package dynamicProgramming;

public class LongestIncreasingSubSequenceDynamicProgrammingIterative {

	public static void main(String[] args) {
		
		
		int [] arrayList = {10,22,9,33,21,50,41,60,444,78,80};
		
		int result = findLongestIncreasingSubSequence(arrayList);

		System.out.println("Final Result is:: "+ result);
	}

	public static int findLongestIncreasingSubSequence(int [] arrayList)
	{
		int [] resultArray = new int[arrayList.length];
		int [] mysol = new int[arrayList.length];
		int [] sol = new int[arrayList.length];
		
		
		resultArray[0]=1;
		for (int i = 1; i < arrayList.length; i++) {
			
			
			for (int k = 0; k < arrayList.length; k++) {
				mysol[k]=-1;
			}
			
			
			for (int j = 0; j < arrayList.length; j++) {
				
				if(j<i && arrayList[i]>arrayList[j])
				{
					sol[j] = resultArray[j];
					mysol[j] = sol[j]+1;
				}
			}
			
			resultArray[i]=-1;
			for (int k = 0; k < arrayList.length; k++) {
				
				if(mysol[k]>0)
				{
					if(resultArray[i]==-1 || resultArray[i]<mysol[k])
					{
						resultArray[i] = mysol[k];
					}
				}
				
			}
			
			if(resultArray[i]==-1)
			 resultArray[i]=1;
			
		}
		
		int longestSubSeq =resultArray[0];
		for (int i = 0; i < resultArray.length; i++) {
			
			System.out.println("resultArray Elements: "+(i+1)+"  :: "+resultArray[i]);
			
			if(longestSubSeq<resultArray[i])
			{
				longestSubSeq = resultArray[i];
			}
			
		}
		
		return longestSubSeq;
	}
	
	public static int max(int x, int y)
	{
		return x>y?x:y;
	}
}
