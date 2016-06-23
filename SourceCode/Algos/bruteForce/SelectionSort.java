package bruteForce;

public class SelectionSort {

	
	
	
	public static void main(String[] args) {
	
		int array [] = {3,5,2,6,32,6,26,36,235,765,6,2};
		
		selectionSort(array);
		System.out.println("Final Result is ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print("\t "+array[i]);
		}
		
	}

	public static void selectionSort(int array[])
	{
		int min=-1, minIndex=-1;
		
		for (int i = 0; i < array.length; i++) {
			
			min=array[i];
			minIndex =i;
			for (int j = i+1; j < array.length; j++) {
				
				if(array[j] < min)
				{
					min=array[j];
					minIndex =j;
				}
			}
			
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
}
