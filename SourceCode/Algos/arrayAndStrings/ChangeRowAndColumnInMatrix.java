package arrayAndStrings;

public class ChangeRowAndColumnInMatrix {

	public static void main(String[] args) {

	int i=4,j=4;
	int n=i;
	int[][] matrix = {
						{1,0,3,4},
						{5,3,7,8},
						{9,4,5,12},
						{13,0,15,16}
					 };
		printMatrix(matrix, n);
		setZeros(matrix, n);
		printMatrix(matrix, n);
		
	}
	
	public static void setZeros(int [][] matrix, int n)
	{
		boolean [] rows = new boolean[n];
		boolean [] cols = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j]==0)
				{
					rows[i] = true;
					cols[j] = true;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(rows[i] || cols[j])
				{
					matrix[i][j]=0;
				}
			}
		}
		
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