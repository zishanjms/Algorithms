package challenge.makeMyTrip;

import java.util.HashMap;

public class ThreeArrayCommonElements1 {

	public static void main(String[] args) {
		
		int k = 1000000;
		long j = (long)k*k;
		System.out.println("j:" + j);
		String str = "zishan";
		
		System.out.println(str.substring(str.length()-3));
		System.out.println(str.substring(0, str.length()-3));
		int[] arr1= {1,2,3,4,5,4,5,5,5,5,5};
		int[] arr2= {4,5,5,6,7,8};
		int[] arr3= {4,8,2,9};
		
		HashMap<Integer, Boolean> map1 = new HashMap<Integer, Boolean>();
		
		for(int i=0; i<arr1.length; i++){
			map1.put(arr1[i], true);
		}
		 
		HashMap<Integer, Boolean> map2 = getCommonElements(map1, arr2);
		map2 = getCommonElements(map2, arr3);
		
		for(Integer in : map2.keySet()){
			System.out.println(in);
		}
	}

	public static HashMap<Integer, Boolean> getCommonElements(HashMap<Integer, Boolean> map, int[] arr){
		HashMap<Integer, Boolean> resultMap = new HashMap<Integer, Boolean>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])){
				resultMap.put(arr[i], true);
			}
		}
		
		return resultMap;
	}
}
