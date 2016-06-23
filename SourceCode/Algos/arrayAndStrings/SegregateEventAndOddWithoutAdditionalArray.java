package arrayAndStrings;

public class SegregateEventAndOddWithoutAdditionalArray {

	public static void main(String[] args) {
		int [] arr = {12,34,45,9,8,90,3};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+"\t");
		}
		System.out.println("\n_____________________________________________________________________________________________________");
		
		segregateEvenAndOdd(arr,0,arr.length-1);
		
		System.out.println("\n_____________________________________________________________________________________________________");
		
		System.out.println("After segregateEvenAndOdd Sort\n\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+"\t");
		}
		System.out.println("\n_____________________________________________________________________________________________________");
		

	}
	
	public static void segregateEvenAndOdd(int[] arr, int left, int right)
	{
		int pivot = arr[left];
		
		while(left<right)
		{
			while((arr[right]%2!=0) && left<right)
			{
				right--;
			}
			
			if(left<right)
			{
				arr[left] = arr[right];
				left++;
			}
			
			while((arr[left]%2==0) && left<right)
			{
				left++;
			}
			
			if(left<right)
			{
				arr[right] = arr[left];
				right--;
			}
		}
		
		arr[left] = pivot;
	}
}
