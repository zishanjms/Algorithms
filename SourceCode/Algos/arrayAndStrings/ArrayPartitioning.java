package arrayAndStrings;

public class ArrayPartitioning {

	public static void main(String[] args) {
		int [] arr = {1,70,75,80,85,45,50,55,65};
		
		System.out.println("Input Array: ");
		for(int a : arr)
		{
			System.out.print("\t" + a);
		}
		System.out.println();
		ArrayPartitioning arrayPartitioning = new ArrayPartitioning();
		int position = arrayPartitioning.partition(arr,1,arr.length-1);
		System.out.println("OutPutArray: ");
		for(int a : arr)
		{
			System.out.print("\t" + a);
		}
	}

	
	public int partition(int []arr, int start, int end)
	{
		int pivot = arr[start];
		int left=start;
		int right=end;
		
		while(left<right)
		{
			while(arr[left]<=pivot && left<right)
			{
				left++;
			}
			while(arr[right]>= pivot  && right>left)
			{
				right--;
			}
			if(left<right)
			swap(arr, left, right);
		}
		swap(arr, start, right);
		
		return right;
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
