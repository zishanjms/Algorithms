package challenge.vizury;

import java.util.*;

public class TestClass1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
        	
        	int N = sc.nextInt();
        	int M = sc.nextInt();
        	int[] arr = new int[N];
        	for(int i=0; i<N; i++){
        		arr[i] = sc.nextInt();
        	}
        	PriorityQueue<Long> maxPQ = new PriorityQueue<Long>(N*N, Collections.reverseOrder());

        	for(int i=0; i<N-M; i++){
            	maxPQ.add(diffOfSet(arr, M, i));
        	}
        	System.out.println(maxPQ.poll());
        }
    }
	
	public static long diffOfSet(int[] arr, int M, int start){
		long result =0;
		HashSet<Integer> diffSet = new HashSet<Integer>();
		diffSet.add(arr[start]);
		for(int i= start+1; i<arr.length - M; i++){
			diffSet.add(e);
		}
		
		return result;
	}

}
