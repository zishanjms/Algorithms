package com.question4;

public class PrintParenthesis {

	public static void main(String[] args) {
		printParenthsis(5, 5, "");

	}
	
	public static void printParenthsis(int leftRemain, int rightRemain, String currentString)
	{
		// Base case when to stop going further
		if(rightRemain==0)
		{
			System.out.println(currentString);
			return;
		}
		
		// Now Start Recursive logic
		if(leftRemain>0)
		{
			printParenthsis(leftRemain-1, rightRemain, currentString+"(");
			
			if(leftRemain<rightRemain)
				printParenthsis(leftRemain, rightRemain-1, currentString+")");
			
		}
		else
			printParenthsis(leftRemain, rightRemain-1, currentString+")");
	}

}
