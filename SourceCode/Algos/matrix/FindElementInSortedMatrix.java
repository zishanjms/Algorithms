package matrix;

import java.util.TreeSet;

public class FindElementInSortedMatrix {

	public static void main(String[] args) {
		int[][] inputArray = { 
				{10, 20, 30, 35},
				{15, 25, 35, 45},
				{38, 49, 57, 68}
				};

		searchElementInSortedMatrix(inputArray, 35);		

	}

	
	public static void searchElementInSortedMatrix(int[][]inputArray, int k)
	{
		int row = inputArray.length;
		int colm = inputArray[0].length;
		int i=0;
		int j=colm-1;
		
		while(i<colm && j>=0)
		{
			if(inputArray[i][j]==k)
			{
				System.out.println("Found The Element " +k +" at row "+i+"  colm "+j);
				return;
			}
			else if(inputArray[i][j]>k)
					j--;
			else
				i++;
		}
	}
}
