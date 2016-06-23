package arrayAndStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class FindConsecutiveSubArrayForSumK {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = {1,4,6,4,3,7,6,4,7,35,6,89};
		
		int k=16;
		
		ArrayList<Integer> resultList = findConsecutiveSubArrayForSumK(arr, k);
		
		for (int i = 0; i < resultList.size(); i++) {
			System.out.println(" "+resultList.get(i));
		}

	}

	
	public static ArrayList<Integer> findConsecutiveSubArrayForSumK(int [] arr, int k)
	{
		ArrayList<Integer> resultList = new ArrayList<>();
		
		int curr_sum=arr[0];
		int start=0;
		
		for (int i = 1; i <= arr.length; i++) {
			
			while(curr_sum> k && start < i-1)
			{
				curr_sum = curr_sum - arr[start];
				start++;
			}
		
			
			if(curr_sum == k)
			{
				System.out.print("result lies between "+start + " : ");
				System.out.print(i-1);
				return resultList;
				
			}
			
			curr_sum = curr_sum + arr[i];
		}
		
		return resultList;
	}
}
