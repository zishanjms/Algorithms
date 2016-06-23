package challenge.inmobi.level1;

public class FindAllSubsetForSum {

	public static int counter=0;
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		//int[] array = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		boolean[] used = new boolean[array.length];
		printAllSubSetForSum(array, used, 0, 0, 12);
		System.out.println("counter "+counter);
	}
	
	public static void printAllSubSetForSum(int[] array, boolean[] used, int startIndex,
			int currentSum, int sum)
	{
		counter++;
		if(currentSum>sum)
			return;
		if(currentSum==sum)
		{
			for (int i = 0; i < array.length; i++) {
				if(used[i])
					System.out.print(array[i] + " , ");
			}
			System.out.println();
			return;
		}
		
		if(startIndex == array.length || array[startIndex]>sum)
			return;
		
		used[startIndex] = true;
		printAllSubSetForSum(array, used, startIndex+1, currentSum+array[startIndex], sum);
		
		used[startIndex] = false;
		printAllSubSetForSum(array, used, startIndex+1, currentSum, sum);
	}

}
