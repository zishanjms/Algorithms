package challenge.hackerRank;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        
        for(int t=0; t<T; t++)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int S = sc.nextInt();
            
            int Hop = (M%N);
            
            
            System.out.println(Hop);
        }

	}

}
