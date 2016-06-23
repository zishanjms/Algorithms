package arrayAndStrings;

public class KthSmallestElementInArray {

	public static void main(String[] args) {
		int [] arr = {65,70,75,80,85,45,50,55,60};
		
		System.out.println("Input Array: ");
		for(int a : arr)
		{
			System.out.print("\t" + a);
		}
		System.out.println();
		
		KthSmallestElementInArray obj = new KthSmallestElementInArray();
		
		System.out.println("Kth Smallest Element of Array: "+ obj.findKthSmallestInArray(arr, 3, arr.length-1));

	}

	
	public int findKthSmallestInArray(int[] arr, int k, int n)
	{
		int low=0;
		int high=n;
		int j=0;
		k-=1;
		ArrayPartitioning arrayPartitioning = new ArrayPartitioning();
		
		while(true)
		{
			j = arrayPartitioning.partition(arr, low, high);
			
			if(k==j)
		    return arr[k];
			else if(k<j)
				{
				   high = j-1;
				}
			else
			{
				low =j+1;
			}
		}
	}
}
