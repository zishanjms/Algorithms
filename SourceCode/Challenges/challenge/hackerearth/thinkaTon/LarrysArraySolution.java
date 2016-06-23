package challenge.hackerearth.thinkaTon;

import java.util.Scanner;

public class LarrysArraySolution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNo = scanner.nextInt();
        for(int t=0; t<testNo; t++){
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++){
                arr[i] = scanner.nextInt();
            }
            int maxRotation = 3;
            boolean result = true;
            for(int i=0; i<N; i++){
                int currentRotation=0;
                if((arr[i] != i+1)){
                	if((i+2)<N){
	                    while(currentRotation<maxRotation && !isArraySorted(arr, i, i+2)){
	                        rotateArray(arr, i, i+1, i+2);
	                        currentRotation++;
	                    }
	                    if(!isArraySorted(arr, i, i+2)){
	                       result = false;
	                    }
                	}
                	else{
                		result = false;
                	}
                }
            }
             String finalResult = result?"YES":"NO";
             System.out.println(finalResult);
        }
  }
    
    public static boolean isArraySorted(int[] arr, int start, int end){
        boolean result = true;
        for(int i=start; i<end; i++){
            if(arr[i] != i+1){
                result = false;
                break;
            }
        }
        return result;
    }
    
    public static void rotateArray(int[] arr, int start, int mid, int end){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = arr[mid];
        arr[mid] = temp;
    }
    
    
}