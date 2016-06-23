package dynamicProgramming;

public class MaxContiguousSubSequenceIterative {

	public static void main(String[] args) {
		
		int [] array = {-2,-3,4,-1,-2,1,5,-3};
		
		int result =  findMaxContiguousSubSequence(array);
		
		System.out.println("Final Result is:: "+ result);

	}

	
	public static int findMaxContiguousSubSequence(int[] array)
	{
		int curr_max=0, max_so_far=0;
		
		for (int i = 0; i < array.length; i++) {
			
			curr_max = curr_max + array[i];
			
			if(curr_max<0)
			  curr_max=0;
			else if(max_so_far<curr_max)
				max_so_far=curr_max;
			
			System.out.println(" array value "+array[i]+"  curr Max: "+curr_max+"  max So Far: "+ max_so_far);
			
		}
	
		return max_so_far;
	}
}
