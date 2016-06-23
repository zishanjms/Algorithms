package challenge.syncron;

public class Solution {

	public static void main(String[] args) {
		
		/*int[] A = new int[300001];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = i;
		}*/
		
		int[] A = {1,2,3,4,5};
		System.out.println(solution(A, 4));

	}
	
	public static boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n -1 ; i++) {
        	
            if (A[i] + 1 < A[i + 1]  && i+1 < K)
                return false;
        }
        if (A[0] != 1 || A[n - 1] != K)
            return false;
        else
            return true;
    }

}
