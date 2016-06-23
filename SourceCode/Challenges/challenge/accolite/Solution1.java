package challenge.accolite;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		int testCases = scanner.nextInt();
		for(int t=0; t<testCases; t++){
			
			int N = scanner.nextInt();

			int[] S = new int[N];
			for (int i = 0; i < N; i++) {
				S[i] = scanner.nextInt();
			}
			
			int[] P = new int[N];
			for (int i = 0; i < N; i++) {
				P[i] = scanner.nextInt();
			}
			
			String moveFirst = scanner.next();
			boolean devuMoveFirst = moveFirst.equals("Devu")?true:false;
			String winner = devuIsWinner(S, P, devuMoveFirst)?"Devu":"Churu";
			System.out.println(winner);
		}
        

	}
	
	public static boolean isAnyoneWinner(int[] S, int[] P){		
		int N = S.length;
		for (int i = 0; i < N; i++) {
			if(S[i]!=P[i]){
				return false;
			}
		}
		
		return true;
	}

	public static boolean devuIsWinner(int[] S, int[] P, boolean isDevuMoveFirst){
		boolean result = false;
		
		int N = S.length;
		
		for (int i = 0; i < N; i++) {
			for (int j = i+1; j < N; j++) {
				
				if(S[i]==P[i]){
					break;
				}
				else if((S[i]==P[j]) && (S[j]==P[i])){
						if(isDevuMoveFirst){
							swap(S, i, j);
							if(isAnyoneWinner(S, P)){
								return true;
							}
							isDevuMoveFirst = false;
						}
						else{
							swap(P, i, j);
							if(isAnyoneWinner(S, P)){
								return false;
							}
							isDevuMoveFirst = true;
						}
						
					
				}
			}
		}
		
		return result;
	}
	
	public static void swap(int[] S, int i, int j){
		int temp = S[i];
		S[i] = S[j];
		S[j] = temp;
	}
}
