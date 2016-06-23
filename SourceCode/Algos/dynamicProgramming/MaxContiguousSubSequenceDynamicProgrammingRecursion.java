package dynamicProgramming;

public class MaxContiguousSubSequenceDynamicProgrammingRecursion {

	public static void main(String[] args) {
		
		int [] array = {-2,-3,-4,-1,-2,-1,-5,-3};
		int arrayLength = array.length-1;
		
		int result = findMaxContiguousSubSequence(array, arrayLength);//  findMaxContiguousSubSequence(array,);

		System.out.println("Final Result is:: "+ result);

	}

	
	public static int findMaxContiguousSubSequence(int [] array,int arrayIndex)
	{
		if(arrayIndex==0)
		{
			return array[0];
		}

		int result = max(findMaxContiguousSubSequence(array, arrayIndex-1) +array[arrayIndex-1], array[arrayIndex-1]);
		System.out.println(" result value "+result+"  arrayIndex  : "+arrayIndex+"  array[arrayIndex]: "+ array[arrayIndex]);
		return result;
	}
	
	public static int max(int x, int y)
	{
		System.out.println("x: "+x+" y: "+y);
		return x>y?x:y;
	}
}
