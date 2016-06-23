package wiproTechQuestion;

public class MonkeysInGarden {

	public static void main(String[] args) {
		int[] arr = {1,2,3,9,5,6,7,8,11,10};
		int length = arr.length;
		
	int finalResult = traveltime(arr, length);

	System.out.println("Final Result is: "+ finalResult);
	}

	
	public static int traveltime(int[] input1,int input2)
    {
		if(input1.length==0 || input2 ==0)
		{
			System.out.println("Input1 Array or input2 is empty");
		}
		
        int[][] travelTimeArray = new int [input2][input2];
        int distance = 0;
        for (int i = 0; i < input2; i++) {
        	for (int j = i+1; j < input2; j++) {
        		distance = j-i;
        		if((distance)>(input2/2))
        		{
        			distance = input2-j;
        		}
        	travelTimeArray[i][j] = input1[i] + distance + input1[j];
			}
		}
        int max = travelTimeArray[0][0];
        for (int i = 0; i < input2; i++) {
			for (int j = i+1; j < input2; j++) {
				if(travelTimeArray[i][j]>max)
				{
					max = travelTimeArray[i][j];
				}
			}
		}
        
		return max;
    }
}
