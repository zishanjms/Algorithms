package challenge.amazon;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {

        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int t=0; t<test; t++){
        	
        	int N = scanner.nextInt();
        	int[][] arr = new int[N+1][N+1];
        	/*for(int i=0; i<=N; i++){
        		arr[i][i] = 0;
        		arr[0][i] = 0;
        		arr[i][0] = 0;
        	}*/
        	for(int i=0; i<N-1; i++){
        		int node1 = scanner.nextInt();
        		int node2 = scanner.nextInt();
        		int weight = scanner.nextInt();
        		arr[node1][node2] = weight;
        		
        		
        	}
        	int sum = 0;
        	for(int i=1; i<=N; i++){
        		for(int j=i+1; j<=N; j++){
        			if(arr[i][j] != 0){
        				arr[i][j] =	findMax(arr, i, j);
        			}
        			sum+= arr[i][j];
        		}
        	}
        	System.out.println(sum);
        }
    

	}

	public static int findMax(int[][] arr, int i, int j){
    	int max = Integer.MIN_VALUE;
    	
    	for(int k=i+1; k<j; i++){
    		for(int l=i; l<=j; l++){
    			if(max<arr[k][l]){
    				max = arr[k][l];
    			}
    		}
    	}
    	return max;
    }
}
