package bruteForce;

public class SequentialSearch {

	public static void main(String[] args) {
		int array [] = {3,5,2,6,32,6,26,36,235,765,6,2};
		int key = 765;
		int index = sequentialSearch(array, key);
		System.out.println("Final Index is :: "+index);

	}

	
	public static int sequentialSearch(int array[], int key){
		
		int result =-1;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]==key)
			{
				result= i;
				break;
			}
			
		}
		
		return result;
	}
}
