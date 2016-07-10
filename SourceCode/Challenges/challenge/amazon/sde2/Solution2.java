package challenge.amazon.sde2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] _arr = new int[n];
		for(int i=0; i<n; i++){
			_arr[i] = sc.nextInt();
		}
		
		/*Scanner in = new Scanner(System.in);
        int res;
        
        int _arr_size = Integer.parseInt(in.nextLine());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine());
            _arr[_arr_i] = _arr_item;
        }*/
		
		Arrays.sort(_arr);
		System.out.println(minArrayItr(_arr, 0, _arr.length-1));
	}
	
	public static int minArrayItr(int[] arr, int lo, int hi){
		int n = arr.length;
		int[][] cache = new int[n][n];
		
		for(int start=0; start<n; start++)
		{
			int i=0;
			for(int j=start; j<n; j++, i++)
			{
				if( 2*arr[i] >= arr[j] )
				{
					cache[i][j] = 0;
				}
				else
				{
					cache[i][j] = Math.min(cache[i+1][j] + 1 , cache[i][j-1] + 1 );
				}
			}
		}
		
		return cache[0][n-1];
		
	}
	
	
	public static int minArrayRec(int[] arr, int lo, int hi){
		
		if(lo>=hi) return -1;
		
		int min = arr[lo];
		int max = arr[hi];
		
		if(2*min >= max) return 0;
		
		return Math.min(minArrayRec(arr, lo+1, hi)+1, minArrayRec(arr, lo, hi-1)+1);
		
	}

	/*public static int minArray(int[] arr){
		int result = 0;
		Arrays.sort(arr);
		int maxFixedCount = 0;
		int minFixedCount = 0;
		int min = arr[0];
		int max = arr[arr.length-1];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]*2 < max){
				maxFixedCount++;
			}
			else{
				break;
			}
		}
		
		for (int i = arr.length-1; i >=0; i--) {
			if(arr[i] > min*2 ){
				minFixedCount++;
			}
			else{
				break;
			}
		}
		
		 result = Math.min(maxFixedCount, minFixedCount);
		return result;
	}*/
	
	
	/*public static int minArray(int[] arr){
		int result =0;
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}
		
		Arrays.sort(arr);
		int i=0;
		int j = arr.length;
		
		int temp = 0;
		while( i < j )
		{
			if(map.get(arr[i]) < map.get(arr[j]))
			{
				temp = map.get(arr[i]);
				map.remove(arr[i]);
				i +=temp;
			}
			else
			{
				temp = map.get(arr[j]);
				map.remove(arr[j]);
				j -= temp;
			}
			
			result += temp;
		}
		return result;
	}*/
}
