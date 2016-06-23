package challenge.rareMile.level2;

public class ArrangeFightingPowers {

	public static void main(String[] args) {
		
		
		int[] Dact = {10,15,8,10,10,10,12,15,16};
		int[] March = {5,10,10,15,15,15,15};
		
		/*int[] Dact = {1,11,1,1,1,1,14,4,4,4,5,6,78,4,4,3,46,7,8,3};
		int[] March = {1,1,1,1,1,1,1,3,4,5,54,3,2,4,4,3,3};*/
		
		int[] resultArray = findArrangements(Dact, March);

		for (int i = 0; i < resultArray.length; i++) {
			System.out.print("\t"+resultArray[i]);
		}
		
	}
	
	public static int[] findArrangements(int[] Dact, int[] March)
	{
		int[] result = new int[Dact.length + March.length];
		int left =0;
		int right=0;
		int rsIdx=0;
		
		while(left < Dact.length && right< March.length)
		{
			if(Dact[left]< March[right])
			{
				result[rsIdx] = Dact[left];
				left++;
			}
			else if(March[right]< Dact[left])
			{
				result[rsIdx] = March[right];
				right++;
			}
			else if(Dact[left] == March[right])
			{
				
				int nextLeft= left;
				int nextRight = right;
				
				while(nextLeft < Dact.length && nextRight< March.length && Dact[nextLeft] == March[nextRight])
				{
					nextLeft++;
					nextRight++;
				}
				
				if(nextLeft < Dact.length && nextRight< March.length)
				{
					if(Dact[nextLeft] < March[nextRight])
					{
						result[rsIdx] = Dact[left];
						left++;
					}
					else
					{
						result[rsIdx] = March[right];
						right++;
					}
				}
				else if(nextLeft== Dact.length)
				{
					result[rsIdx] = March[right];
					right++;
				}
				else if(nextRight == March.length)
				{
					result[rsIdx] = Dact[left];
					left++;
				}
				
				
			}
			rsIdx++;
		}
		
		while(left < Dact.length)
		{
			result[rsIdx] = Dact[left];
			left++;
			rsIdx++;
		}
		
		while(right < March.length)
		{
			result[rsIdx] = March[right];
			right++;
			rsIdx++;
		}
		return result;
	}
 	
	

}
