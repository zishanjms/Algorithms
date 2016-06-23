package arrayAndStrings;

public class FindPeakDivideAndConquer {

	public static void main(String[] args) {
		int [] arr = {10, 20, 15, 2, 23, 90, 67};
		
		int resultIndex = findPeak(arr, 0, arr.length-1);
		
		System.out.println("First Peak is " + arr[resultIndex]);
	}
	
	
	public static int findPeak(int[] arr, int low, int high)
	{
		int mid = (low+high)/2;
		
		if((mid==0 || arr[mid-1]<arr[mid]) && (mid==arr.length-1 || arr[mid+1]< arr[mid]))
			return mid;
		else if(mid>0 && arr[mid-1]>arr[mid])
			return findPeak(arr, low, mid-1);
		else
			return findPeak(arr, mid+1, high);
	}
}
