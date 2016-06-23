package greedy;


public class NQueenProblemUsingBackTracking {

	public int N;
	
	public NQueenProblemUsingBackTracking(int N)
	{
		this.N = N;
	}
	
	public boolean isSafeToPlaceQueen(int[][] chessBoard, int row, int col)
	{
		int i,j;
		
		// check left side of row
		for (i = 0; i < col; i++) {
			if(chessBoard[row][i]==1)
				return false;
		}
		
		//Check Upper Left Diagonal
		for (i = row,j =col; i>=0 && j>=0; i--,j--) {
			if(chessBoard[i][j]==1)
				return false;
		}
		
		//Check Lower Left Diagonal
				for (i = row,j =col; i<N && j>=0; i++,j--) {
					if(chessBoard[i][j]==1)
						return false;
				}
				
		return true;		
	}
	
	public boolean placeQueen(int[][] chessBoard, int col)
	{
		if(col>=N)			// Base Case
		return true;
		
		for (int i = 0; i < N; i++) {
			
			if(isSafeToPlaceQueen(chessBoard, i, col))
			{
				chessBoard[i][col] = 1;
				
				if(placeQueen(chessBoard, col+1)== true)
					return true;
				
				chessBoard[i][col]=0;
			}
			
		}
		return false;
	}
	
	public void printChessBoard(int[][] chessBoard)
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("  " + chessBoard[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	public void createEmptyChessBoard(int[][] chessBoard)
	{
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				chessBoard[i][j] = 0;
			}
			
		}
	}
	
	public static void main(String[] args) {

		NQueenProblemUsingBackTracking nQueen = new NQueenProblemUsingBackTracking(8);
		int[][] chessBoard = new int[nQueen.N][nQueen.N];
		nQueen.createEmptyChessBoard(chessBoard);
		if(nQueen.placeQueen(chessBoard, 0)==false)
		{
			System.out.println("No solution Exists");
			System.exit(-1);
		}
	     
		nQueen.printChessBoard(chessBoard);
	}

}
