package challenge.hackerRank;

import java.util.Scanner;

public class EncriptSentence {

	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String newStr = s.replaceAll(" ","");
        int L = newStr.length();
        
        int rows = (int)Math.sqrt(L);
        int cols = rows;
        int matrixLength = rows*cols;
        while(matrixLength<L){
            cols++;
            matrixLength = rows*cols;
        }
        
        char[][] input = new char[rows][cols];
        int k = 0;
        char[] charArray = newStr.toCharArray();
        
        for(int i=0; i<rows && k<L; i++){
            for(int j=0; j<cols && k<L ; j++, k++){
                input[i][j] = charArray[k];
            }
        }
        
        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
            	if(input[j][i]==0) break;
                System.out.print(input[j][i]);
            }
            System.out.print(" ");
        }
    

	}

}
