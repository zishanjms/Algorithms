package arrayAndStrings;

public class MatixRotation {

	public static void main(String[] args) {

		int i=4,j=4;
		int n=i;
		int[][] matrix = {
							{1,2,3,4},
							{5,6,7,8},
							{9,10,11,12},
							{13,14,15,16}
						 };
		printMatrix(matrix, n);
		
		rotateMatrix(matrix, n);
		
		
	}

	public static void rotateMatrix(int [][] matrix, int n)
	{
		for (int layer = 0; layer < n/2; layer++) {
			
			int first=layer;
			int last = n-1-layer;
			
			for (int i =first; i < last; i++) {
				
				int offset=i-first;
				
				// move top to temp
				int temp = matrix[first][i];
				
				// move left to top
				matrix[first][i] = matrix[last-offset][first];
				
				//move bottom to left
				matrix[last-offset][first] = matrix[last][last-offset];
				
				// move right to bottom
				matrix[last][last-offset] = matrix[i][last];
				
				//move temp to right
				matrix[i][last] = temp;
				
			}
		}
		
		printMatrix(matrix, n);
	}
	
	public static void printMatrix(int [][] matrix, int n)
	{
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
