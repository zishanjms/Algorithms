package maximizingProblem;

public class MaximizingProblem {

	public static void main(String[] args) {
	
		int array[] = {0,1,2,3,4};
		int A=0,B=0,C=0;
		
		for (int i = 1; i < array.length; i++) {
			A += Math.pow(-1, i) * array[i];
			System.out.println("Value of A:: "+A);
		}
		
		
		for (int i = 1; i < array.length; i++) {
			B+=1*array[i];
			System.out.println("Value of B:: "+B);

		}

		
		C=A*B;
		
		System.out.println("Value of C:: "+C);
	}

}
