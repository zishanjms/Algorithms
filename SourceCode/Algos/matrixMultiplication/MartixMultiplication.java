package matrixMultiplication;

public class MartixMultiplication {

	public static void main(String[] args) {

		int m =3;
		int n=4;
		int p=4;
		int q=3;
		int source1Array [][] = new int[m][n];
		
		int source2Array [][] = new int[p][q];
		
		for(int i=0,k=1;i<m;i++)
		{
			for(int j=0;j<n;j++,k++)
			{
				source1Array[i][j] = k;
			}
		}
		
		printArrayElements(source1Array, m, n);
		
		for(int i=0,k=1;i<p;i++)
		{
			for(int j=0;j<q;j++,k++)
			{
				source2Array[i][j] = k;
			}
		}
		
		printArrayElements(source2Array, p, q);
		
		
		int resultArray[][] = matrixMultiplication(source1Array,m,n,source2Array,p,q);
		
		printArrayElements(resultArray, m, q);
	}

	
	public static void printArrayElements(int array[][], int nbrOfRow, int nbrOfColm)
	{
		System.out.println("Array Elements are:: ");
		for(int i=0;i<nbrOfRow;i++)
		{
			System.out.println();
			for(int j=0;j<nbrOfColm;j++)
			{
			 System.out.print("\t"+array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int [][] matrixMultiplication(int arr1[][],int m, int n, int arr2[][], int p, int q)
	{
		
		int resultArray[][] = new int[m][q];
		
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
				for(int k=0;k<p;k++)
				{
					resultArray[i][j] += arr1[i][k] * arr2[k][j]; 
				}
			}
		}
		
		
		return resultArray;
	}
}
