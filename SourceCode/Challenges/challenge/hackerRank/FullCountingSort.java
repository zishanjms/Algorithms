package challenge.hackerRank;

import java.util.Scanner;

public class FullCountingSort {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];
        String[] strArr = new String[n];
        
        for(int i=0; i<n; i++){
            intArr[i] = sc.nextInt();
            strArr[i] = sc.next();
        }
        int[] arr = new int[100];
        for(int i=0; i<n; i++){
            arr[intArr[i]+1]++;
        }
        
        for(int i=0; i<arr.length-1; i++){
            arr[i+1] += arr[i];
        }
        
        /*for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }*/
        
        String[] aux = new String[n];
        
        for(int i=0; i<n; i++){
           
               aux[arr[intArr[i]]++] = strArr[i];   
        }
        
        for(int i=0; i<n; i++){
            
            System.out.print(aux[i]+" ");
        }
     }

}
