package com.code.arrayAndStrings.question6;

/*Given an image represented by an NxNmatrix, where each pixel in the image is
4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
place?*/
public class RotateMatrixBy90Degree {

	public static void main(String[] args) {

		int[][] array = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		print2DArray(array);
		
		rotateArrayBy90Degree(array);
		
		System.out.println("---------------------------------------------------");
		print2DArray(array);

	}

	public static void rotateArrayBy90Degree(int[][] array)
	{
		int n = array.length;
		for (int layer = 0; layer < n/2; layer++) {
			int first=layer;
			int last=n-layer-1;
			
			
			for (int i = first; i < last; i++) {
				int offset=i-first;
				int top = array[first][i];
				
				array[first][i] = array[last-offset][first];
				
				array[last-offset][first] = array[last][last-offset];
				
				array[last][last-offset] = array[i][last];
				
				array[i][last] = top;
				
				
				
			}
			System.out.println("/////////////////////////////////////////////////////////////////////////////");
			print2DArray(array);
			System.out.println("/////////////////////////////////////////////////////////////////////////////");

		}
	}
	
	
	public static void print2DArray(int[][] array)
	{
		for (int i = 0; i < array[0].length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("\t" +array[i][j]);
			}
			System.out.println();
		}
	}
}
