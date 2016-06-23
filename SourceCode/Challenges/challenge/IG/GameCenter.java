package challenge.IG;

import java.util.ArrayList;
import java.util.Scanner;

public class GameCenter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] rows = new String[N];
		for (int i = 0; i < N; i++) {
			rows[i] = scanner.next();
		}

		
		String[] result = amount_value(N, rows);
		for(String str : result){
			System.out.println(str);
		}
	}
	
	public static String[] amount_value(int input1, String[] input2){
		int[][] matrix = new int[input1][input1];
		
		for (int i = 0; i < input1; i++) {
			String[] charArray = input2[i].split("#");
			for (int j = 0; j < input1; j++) {
				matrix[i][j] = Integer.parseInt(charArray[j]+"");
			}
		}
		
		int[][] minMatrix = findMinMatrix(matrix);
		ArrayList<String> resultList = getMaxListFromMinMatrix(minMatrix);
		
		String[] result = resultList.toArray(new String[resultList.size()]);
		return result;
	}

	public static int[][] findMinMatrix(int[][] matrix){
		int N = matrix.length;
		int[][] minMatrix = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				minMatrix[i][j] = findMinNeighbour(matrix,i,j);
		}
	}
		return minMatrix;
}

	public static int findMinNeighbour(int[][]m, int i, int j){
		int min = Integer.MAX_VALUE;
		int N = m.length;
		
		// original Value
		if(min>m[i][j]){
			min = m[i][j];
		}
		//n1
		if((i-1)>=0 && ((j-1)>=0))
		{
			if(min>m[i-1][j-1]){
				min = m[i-1][j-1];
			}
		}
		
		//n2
		if((i-1)>=0)
		{
			if(min>m[i-1][j]){
				min = m[i-1][j];
			}
		}
		
		//n3
		if((i-1)>=0 && ((j+1)<N))
		{
			if(min>m[i-1][j+1]){
				min = m[i-1][j+1];
			}
		}
		
		//n4
		if((j+1)<N)
		{
			if(min>m[i][j+1]){
				min = m[i][j+1];
			}
		}
		
		//n5
		if(((i+1)<N) && (j+1)<N)
		{
			if(min>m[i+1][j+1]){
				min = m[i+1][j+1];
			}
		}
		
		//n6
		if((i+1)<N)
		{
			if(min>m[i+1][j]){
				min = m[i+1][j];
			}
		}
		
		//n7
		if(((i+1)<N) && (j-1)>=0)
		{
			if(min>m[i+1][j-1]){
				min = m[i+1][j-1];
			}
		}
		
		//n8
		if((j-1)>=0)
		{
			if(min>m[i][j-1]){
				min = m[i][j-1];
			}
		}
		
		return min;
	}

	public static ArrayList<String> getMaxListFromMinMatrix(int[][] matrix){
		int N = matrix.length;
		int max = Integer.MIN_VALUE;
		ArrayList<String> result = new ArrayList<>();
		int x,y=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(max == matrix[i][j]){
					x=i+1;
					y=j+1;
					result.add(x + "#" + y);
				}
				else if(max<matrix[i][j]){
					result.clear();
					
					max = matrix[i][j];
					x=i+1;
					y=j+1;
					result.add(x + "#" + y);
				}
			}
		}
		
		return result;
	}
	
}