package challenge.hackerRank;

import java.util.Scanner;

public class CountingSort3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        
        for(int i=0; i<n; i++){
            String input = sc.next();
            sc.next();
            int val = Integer.parseInt(input);
            arr[val]++;
        }
        
        int counter = 0;
        for(int i=0; i<arr.length; i++){
            counter += arr[i];
            System.out.print(counter+" ");
        }
     }

}
