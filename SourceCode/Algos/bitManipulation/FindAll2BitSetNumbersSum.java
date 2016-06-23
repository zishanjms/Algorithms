package bitManipulation;

import java.util.Scanner;

public class FindAll2BitSetNumbersSum {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		
		int firstInput = sc.nextInt();
		int secondInput = sc.nextInt();
		
		int sum = findSumOfLuckyNumbers(secondInput);
		
		System.out.print("final sum is: "+sum);
	}

	
	public static int findSumOfLuckyNumbers(int number)
	{
		int sum=0;
		for (int i = 0; i <= number; i++) {
			
			if(isNumberContainsTwoBitSets(i))
				sum += i;
			
		}
		
		return sum;
	}
	
	public static boolean isNumberContainsTwoBitSets(int n)
	{
		boolean result = false;
		int counter = 0;
		
		while(n!=0)
		{
			counter += n &1;
			n>>=1;
		}
		
		if(counter==2)
		{
			result =  true;
		}
		
		return result;
	}
}
