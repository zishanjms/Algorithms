package dynamicProgramming;

public class ClimbingStairCaseProblem {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		System.out.println("Combination of Climbing Stairs : recursive Soln:: "+waysRecursive(10));
		System.out.println("Time Taken by Recursive Soln:: "+ (System.currentTimeMillis()-start));
		
		
		start = System.currentTimeMillis();
		System.out.println("Combination of Climbing Stairs : Iterative Soln:: "+waysIterative(10));
		System.out.println("Time Taken by Iterative Soln:: "+ (System.currentTimeMillis()-start));

		
		
	}

	public static int waysRecursive(int n)
	{
		if(n==1) return 1; //{(1)}
		if(n==2) return 2; //{(1,1),(2)}
		if(n==3) return 4; //{(1,1,1),(1,2),(2,1),(3)}
		
		return waysRecursive(n-1) + waysRecursive(n-2) + waysRecursive(n-3);
	}
	
	
	public static int waysIterative(int n)
	{
		if(n==1) return 1; //{(1)}
		if(n==2) return 2; //{(1,1),(2)}
		if(n==3) return 4; //{(1,1,1),(1,2),(2,1),(3)}
		
		int[] previousValues = {1,2,4};
		int current = 3;
		
		while(current<n)
		{
			int prevTotal  = previousValues[0] + previousValues[1] + previousValues[2];
			
			previousValues[0] = previousValues[1];
			previousValues[1] = previousValues[2];
			previousValues[2] = prevTotal;
			
			current++;
		}
		
		return previousValues[2];
	}
	
}
