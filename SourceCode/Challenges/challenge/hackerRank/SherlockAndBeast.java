package challenge.hackerRank;

import java.util.Scanner;

public class SherlockAndBeast {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int y = in.nextInt();
            StringBuilder result = new StringBuilder();
            
            int z = y;
            while(z%3 != 0){
            	z -=5;
            	if(z<0){
            		System.out.println("-1");
            		break;
            	}
            }
            y = y-z;
            while(z>0){
            	result.append("5");
            	z--;
            }
            
            while(y>0 && z>-1){
            	result.append("3");
            	y--;
            }
            
            System.out.println(result);
        }
    
	}

}
