package challenge.syncron;

import java.util.*;

public class findKSumInContiguousSubArray {

	public static void main(String[] args) {
		int[] INPUT = { -10, 6, 2, 8, 1, 3, 5 };
	    findSUbArrays(INPUT, 8);
		//printSubarrays(INPUT, 5);

	}

	private static void findSUbArrays(int[] input, int k){
		Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
		cache.put(-1, 0);
		int preSum = 0;
		for(int i=0; i<input.length; i++){
			preSum += input[i];
			if(cache.containsKey(preSum -k)){
				int start = cache.get(preSum - k);
				System.out.println("Start: " + start + " End: "+ i);
			}
			
			cache.put(preSum, i);
		}
	}
	
	private static void printSubarrays(int[] input, int k) {
	    Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	    List<Integer> initial = new ArrayList<Integer>();
	    initial.add(-1);
	    map.put(0, initial);
	    int preSum = 0;

	    // Loop across all elements of the array
	    for(int i=0; i< input.length; i++) {
	        preSum += input[i];
	        // If point where sum = (preSum - k) is present, it means that between that 
	        // point and this, the sum has to equal k
	        if(map.containsKey(preSum - k)) {   // Subarray found 
	            List<Integer> startIndices = map.get(preSum - k);
	            for(int start : startIndices) {
	                System.out.println("Start: "+ (start+1)+ "\tEnd: "+ i);
	            }
	        }

	        List<Integer> newStart = new ArrayList<Integer>();
	        if(map.containsKey(preSum)) { 
	            newStart = map.get(preSum);
	        }
	        newStart.add(i);
	        map.put(preSum, newStart);
	    }
	}
}
