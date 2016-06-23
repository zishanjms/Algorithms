package arrayAndStrings;

public class ShiftKElementsInArray {

	public static void main(String[] args) {
		
		int [] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

		printArray(arr);
		shiftKElementsInArray(arr, 5);
		printArray(arr);
		
	}

	public static void printArray(int[] arr)
	{
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\t" + arr[i]);
		}
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
	}
	
	public static void shiftKElementsInArray(int[] arr, int k)
	{
		int nxtIdx=-1;
		
		if(k<0 || k > arr.length)
		{
			System.out.println("Invalid value of k" +k);
			return;
		}
		
		
		/*for (int j = 0; j < k; j++) {
			arr[j] = -1;
		}*/
		
		for (int i = k, l=0; i < arr.length; i++,l++) {
			arr[l] = arr[i];
			arr[i] = -1; 
			
		}
	}
}
