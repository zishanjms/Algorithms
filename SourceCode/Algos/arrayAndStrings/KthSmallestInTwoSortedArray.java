package arrayAndStrings;

public class KthSmallestInTwoSortedArray {

	public static void main(String[] args) {
		
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10,11,12};

		int result = findKthSmallestInTwoSortedArray(arr1, arr2, 13);
		System.out.println("Result is : "+ result);
	}

	public static int findKthSmallestInTwoSortedArray(int[] arr1, int[] arr2, int k)
	{
		if(k<=0 || k> ( arr1.length + arr2.length))
		{
			throw new RuntimeException("K is either less than or equal to 0");
		}
		
		int arr1Idx = 0;
		int arr2Idx = 0;
		int key=0;
		
		while(arr1Idx < arr1.length && arr2Idx < arr2.length && k>0)
		{
			if(arr1[arr1Idx] < arr2[arr2Idx])
			{
				key = arr1[arr1Idx];
				arr1Idx++;
			}
			else
			{
				key = arr2[arr2Idx];
				arr2Idx++;
			}
			k--;
		}

		while(arr1Idx < arr1.length && k>0)
		{
			key = arr1[arr1Idx];
			arr1Idx++;
			k--;
		}
		
		while(arr2Idx < arr2.length && k>0)
		{
			key = arr2[arr2Idx];
			arr2Idx++;
			k--;
		}
		
		return key;
	}
	
}
