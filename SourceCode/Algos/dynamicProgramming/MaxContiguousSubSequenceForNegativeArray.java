package dynamicProgramming;

public class MaxContiguousSubSequenceForNegativeArray {

	public static void main(String[] args) {
		
		int [] array = {-2,-3,4,-1,-2,1,5,-3};
		
		int result =  findMaxContiguousSubSequence(array);
		
		System.out.println("Final Result is:: "+ result);

	}

	
	public static int findMaxContiguousSubSequence(int[] array)
	{
		
		int curr_max=array[0], max_so_far=array[0];
		
		for (int i = 1; i < array.length; i++) {
			
			curr_max = max(array[i], curr_max+array[i]);
			max_so_far = max(curr_max, max_so_far);
			
			System.out.println(" array value "+array[i]+"  curr Max: "+curr_max+"  max So Far: "+ max_so_far);
			
		}
	
		return max_so_far;
	}
	
	public static int max(int x, int y)
	{
		return x>y?x:y;
	}
}
