package challenge.hackerRank;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		int[][] input = new int[rows][cols];
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				input[i][j] = scanner.nextInt();
			}
		}

		int R = scanner.nextInt();
		printMatrix(input);
		
		rotateMatrix(input, R);
	}

	public static void rotateMatrix(int[][] input, int R){
		
		int rows = input.length;
		int cols= input[0].length;
		int totalLayers = (rows<cols?rows:cols)/2;
		
		for (int r = 0; r < R; r++) {
			
			for (int layer = 0; layer < totalLayers; layer++) {
				int first = layer;
				int last = (rows>cols?rows:cols) - 1 - layer;
				int temp = input[first][first];
				for (int i = first; i < last-1; i++) {
					input[layer][i] = input[layer][i+1];
				}
				for(int i=first; i<last-1; i++){
					input[i][layer] = input[i][layer+i];
				}
				for(int i=first; i<last-1; i++){
					input[last][i] = input[last][i-1];
				}
			}
			
		}
	}
	
	public static void printMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
