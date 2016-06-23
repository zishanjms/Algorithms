package challenge.hackerRank;

import java.util.Scanner;

public class LisasProblem {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] inputQ = new int[n];
        for(int i=0; i<n; i++){
            inputQ[i] = scanner.nextInt();
        }
        int pageNo = 1;
        int quesNo = 1;
        int splProb = 0;
        for(int i=0; i<n; i++){
            for(int j=quesNo; j<=inputQ[i]; j++){
                if(pageNo == j){
                    System.out.println("PageNo: " + pageNo);
                    System.out.println("j: " + j);
                    splProb++;
                }
                
                if((j%k)==0 || j==inputQ[i]){
                    pageNo++;
                }
            }
        }
        
        System.out.println(splProb);
    

	}

}
