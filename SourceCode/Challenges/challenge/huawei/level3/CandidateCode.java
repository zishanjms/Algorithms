package challenge.huawei.level3;

public class CandidateCode {

	public static void main(String[] args) {
		
		int[] input1 = {4,6};
		int[] input2 = {1,3,0,0,0,0,0,0,4,5,1,0,0,0,0,6,7,6,0,0,0,0,5,0};
		
		int result = no_of_path(input1, input2);
		
		System.out.println("Final result is: "+ result);
		
	}

	public static int no_of_path(int[] input1,int[] input2)
    {
        int[][] arr = new int[input1[0]][input1[1]];
        int idx=0;
        for (int i = 0; i < input1[0]; i++) {
			
        	for (int j = 0; j < input1[1]; j++,idx++) {
				arr[i][j] = input2[idx];
			}
		}
        
        return findPath(arr, 0, 0);
        
    }
	
	public static int findPath(int[][] arr, int y, int x)
	{
		if(y==arr.length-1 && x==arr[0].length-1)
		{
			return 1;
		}
		int result=0;
		if((y>=0 && y<arr.length) && (x>=0 && x<arr[0].length))
		{
		switch (arr[y][x]) {
		case 0:
			return -1;
		case 1:
			 result = findPath(arr, y, x+1);
			 return result;
		case 2:
			 result = findPath(arr, y+1, x);
			 return result;
		case 3:
			 result = findPath(arr, y+1, x+1);
			 return result;
		case 4:
			int result41 = findPath(arr, y+1, x);
			int result42 = findPath(arr, y, x+1);
			int final4=0;
			if(result41 != -1)
				final4 += result41;
			if(result42 != -1)
				final4 += result42;
			
			return final4;
			
			
		case 5:
			int result51 = findPath(arr, y, x+1);
			int result52 = findPath(arr, y+1, x+1);
			int final5=0;
			if(result51 != -1)
				final5 += result51;
			if(result52 != -1)
				final5 += result52;
			return final5;
		case 6:
			int result61 = findPath(arr, y+1, x);
			int result62 = findPath(arr, y+1, x+1);
			int final6=0;
			if(result61 != -1)
				final6 += result61;
			if(result62 != -1)
				final6 += result62;
			return final6;
			
		case 7:
			int result71 = findPath(arr, y+1, x);
			int result72 = findPath(arr, y+1, x+1);
			int result73 = findPath(arr, y, x+1);
			int final7=0;
			if(result71 != -1)
				final7 += result71;
			if(result72 != -1)
				final7 += result72;
			if(result73 != -1)
				final7 += result73;
			return final7;	
		default:
			return -1;
		}
			
		}
		return -1;
	}
}
