package arrayAndStrings;

public class QuickSort {

	public static void main(String[] args) {
		int [] arr = {95,70,75,80,85,45,50,55,65};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+"\t");
		}
		System.out.println("\n_____________________________________________________________________________________________________");
		
		quickSort(arr,0,arr.length-1);
		
		System.out.println("After Quick Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+"\t");
		}
		System.out.println("\n_____________________________________________________________________________________________________");
		

	}

	public static void quickSort(int[] arr, int left, int right)
	{
		if(left<right)
		{
			System.out.println("Left " +left + " Right "+ right);
			int partitionPostition = partition(arr, left, right);
			quickSort(arr, left, partitionPostition-1);
			quickSort(arr, partitionPostition+1, right);
		}
	}
	
	public static int partition(int[] arr, int left, int right)
	{
		int pivot = arr[left];
		
		while(left<right)
		{
			while(arr[right]>pivot && left<right)
			{
				right--;
			}
			
			if(left<right)
			{
				arr[left] = arr[right];
				left++;
			}
			
			while(arr[left]<pivot && left<right)
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
		return left;
	}
}
