package arrayAndStrings;

public class FindPeakIn2D {

	public static void main(String[] args) {
		
		int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,29,25}};

		int finalResult = findPeakIn2DArray(arr, 0, arr[0].length);
		
		System.out.println("Final O/p: " + finalResult);
	}

	public static int findPeakIn2DArray(int[][] arr, int lowerColm, int higherColm)
	{	
		int midColm = (lowerColm + higherColm) /2;
		
		int rowPos = findMaxColmPostition(arr, midColm);
		
		if((midColm == 0 || arr[rowPos][midColm-1] < arr[rowPos][midColm]) && (midColm == arr[0].length || arr[rowPos][midColm+1] < arr[rowPos][midColm]))
		return arr[rowPos][midColm];
		else if(midColm > 0 && arr[rowPos][midColm-1] > arr[rowPos][midColm] )
			return findPeakIn2DArray(arr, lowerColm, midColm-1);
		else
			return findPeakIn2DArray(arr, midColm+1, higherColm);
		
	}
	
	public static int findMaxColmPostition(int[][] arr, int colmNbr)
	{
		int maxIndex=0;
		int maxNumber=-arr[0][colmNbr];
		
		for (int i = 1; i < arr[0].length; i++) {
			if(maxNumber < arr[i][colmNbr])
			{
				maxNumber = arr[i][colmNbr];
				maxIndex = i;
			}
		}
		
		
		return maxIndex;
	}
	
}
