package com.code.arrayAndStrings.question7;

/*Write an algorithm such that if an element in an MxN matrix is 0, its entire row
and column are set to 0.*/
public class ResetRowAndColumnInMatrix {

	public static void main(String[] args) {
		int[][] array = {{1,2,3,4},{5,0,7,8},{9,10,11,12},{13,14,15,16}};
		
		print2DArray(array);

		reset2DArray(array);
		System.out.println("------------------------------------------------------");
		print2DArray(array);
	}

	public static void reset2DArray(int[][] array)
	{
		boolean[] rowValue = new boolean[array.length];
		boolean[] colmValue = new boolean[array.length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(array[i][j]==0)
				{
					rowValue[i] = true;
					colmValue[i] = true;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if(rowValue[i] || colmValue[j])
					array[i][j]=0;
			}
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
