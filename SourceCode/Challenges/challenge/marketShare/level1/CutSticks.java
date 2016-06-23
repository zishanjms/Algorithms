package challenge.marketShare.level1;

public class CutSticks {

	public static void main(String[] args) {
		int[] lengths = {5,4,4,2,2,8};
		cutSticks(lengths);

	}

	public static void cutSticks(int [] lengths)
	{
		int result = lengths.length;
		while(result != 0)
		{
			System.out.println(result);
			result = cutSticksAndRemoveSticks(lengths);
		}
		
	}
	
	public static int cutSticksAndRemoveSticks(int[] lengths)
	{
		int min = findMin(lengths);
		
		for (int i = 0; i < lengths.length; i++) {
			lengths[i] -=min; 
		}
		
		int noOfNonZeroElement = findAllNonZeroElements(lengths);
		
		return noOfNonZeroElement;
	}
	
	public static int findAllNonZeroElements(int [] lengths)
	{
		int counter=0;
		for (int i = 0; i < lengths.length; i++) {
			if(lengths[i]>0)
				counter++;
		}
		
		return counter;
	}
	
	public static int findMin(int [] lengths)
	{
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < lengths.length; i++) {
			if(lengths[i]>0 && lengths[i]<min)
				min = lengths[i];
		}
		return min;
	}
}
