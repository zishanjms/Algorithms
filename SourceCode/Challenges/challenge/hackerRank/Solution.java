package challenge.hackerRank;

import java.util.*;


public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            int[][] inp = new int[R][C];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
                char[] charArr = G[G_i].toCharArray();
                for(int j=0; j<C; j++){
                    inp[G_i][j] = Integer.parseInt(charArr[j]+""); 
                }
            }
            
            int r = in.nextInt();
            int c = in.nextInt();
            int[][] patt = new int[r][c];
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
                char[] charArr = P[P_i].toCharArray();
                for(int j=0; j<c; j++){
                    patt[P_i][j] = Integer.parseInt(charArr[j]+""); 
                }
            }
            int firstElementOfPatt = patt[0][0];
            boolean result = false;
           main: for(int i=0; i<R; i++){
              B:  for(int j=0; j<C; j++){
                    
                    if(inp[i][j]==firstElementOfPatt){
                        A:for(int k=0; k<r; k++){
                            for(int l=0; l<c; l++){
                            	
                            	if((i+k)>=R || (j+l)>=C){
                            		break B;
                            	}
                            	if(inp[i+k][j+l]!=patt[k][l]){
                                        break A;
                                    }
                            	if(k==r-1 && l==c-1){
                            		result = true;
                            		break main;
                            	}
                            }
                        }
                    }
                        
                }
            }
            if(result){
                System.out.println("YES");
            }
             else{
                 System.out.println("NO");
            }
        }
    }
    	
}
