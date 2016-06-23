package eightQueenProblem;

import java.util.ArrayList;

public class EightQueenProblem {

	public static final int GRID = 4;
	
	public static void main(String[] args) {

		Integer [] columns = {0,0,0,0,0,0,0,0};
		ArrayList<Integer[]> result = new ArrayList<>();
		placeQueen(0, columns, result);
		
		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < GRID; j++) {
				System.out.println(result.get(i)[j]);
			}
		}
	}
	
	public static void placeQueen(int row, Integer[] columns, ArrayList<Integer[]> result)
	{
		System.out.println("Place Queen ---> row1 " + row);
		if(row == GRID)
		{
			result.add(columns.clone());
		}
		else
		{
			for (int col = 0; col < GRID; col++) {
				if(checkValid(columns,row, col))
					columns[row] = col;
				System.out.println("In Loop  ---> row1 " + row + "  column1: " + col);
				placeQueen(row + 1, columns, result);
			}
		}
	}

	public static boolean checkValid(Integer[] columns, int row1, int column1)
	{
		System.out.println("In CheckValid function ");
		for (int row2 = 0; row2 < row1; row2++) {
			
			int column2 = -1;
			if(columns[row2] !=null)
			 column2 = columns[row2];
			
			System.out.println("CheckValid ----> Row1: " + row1 + " Column1 " + column1 + " Row2: " + row2 + " Column2 " + column2);
			
			if(column1 == column2)
				return false;
			
			int colmDiff = Math.abs(column2 - column1);
			int rowDiff = row1 - row2;
			
			if(colmDiff == rowDiff)
				return false;
			
		}
		
		return true;
	}
}
