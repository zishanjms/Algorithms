package dynamicProgramming;

public class MaxContiguousSubSequenceDynamicProgrammingIterative {

	public static void main(String[] args) {
		
		int [] array = {-2,-3,4,-1,-2,1,5,-3};
		int arrayLength = array.length-1;
		
		int result = findMaxContiguousSubSequence(array);//  findMaxContiguousSubSequence(array,);

		System.out.println("Final Result is:: "+ result);

	}

	
	public static int findMaxContiguousSubSequence(int [] array)
	{
		int resultArray[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			if(i-1>=0)
			resultArray[i] = max(resultArray[i-1]+array[i],array[i]);
			System.out.println(" result value "+resultArray[i]+"  arrayIndex  : "+i+"  array[i]: "+ array[i]);
		}
		
		int finalResult=-1;
		for (int i = 0; i < resultArray.length; i++) {
			if(finalResult<resultArray[i])
			{
				finalResult = resultArray[i];
			}
		}
		
		return finalResult;
	}
	
	public static int max(int x, int y)
	{
		return x>y?x:y;
	}
}
