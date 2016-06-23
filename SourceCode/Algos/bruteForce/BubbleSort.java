package bruteForce;

public class BubbleSort {

	public static void main(String[] args) {
		
		int array [] = {3,5,2,6,32,6,26,36,235,765,6,2};
		
		bubbleSort(array);
		System.out.println("\n Final Result is ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t "+array[i]);
		}
		
	}
	
	public static void bubbleSort(int array[])
	{
		
		for (int i = 0; i < array.length-1; i++) {
			
			for (int j = 0; j < array.length-i-1; j++) {
				
				if(array[j+1]<array[j])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
			System.out.println();
			for (int k = 0; k < array.length; k++) {
				System.out.print("\t "+array[k]);
			}
		}
	}

}
