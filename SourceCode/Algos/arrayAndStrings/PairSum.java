package arrayAndStrings;

public class PairSum {

	private static int MAX =100000;
	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,50,6,7,43,3,6,5,6,3,25,2,45,6,4,3,5,4,3,5,66545,34,44,40,323};
		
		int sum = 90;

		findPairSum(arr, sum);
	}

	public static void findPairSum(int[] arr, int sum)
	{
		boolean[] binMap = new boolean[MAX];
		
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			
			if(temp>=0 && binMap[temp])
			{
				System.out.println("Result found at " + arr[i] + " & "+ temp);
				return;
			}
			binMap[arr[i]] = true;
		}
		
		
	}
	
}
