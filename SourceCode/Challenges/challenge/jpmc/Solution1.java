package challenge.jpmc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = in.readLine()) != null) {
	        String[] inputs = s.split(" ");
	        String firstStr = inputs[0];
	        String secondStr = inputs[1];
	    
	        int firstNumber = Integer.parseInt(firstStr,2);
	        int secondNumber = Integer.parseInt(secondStr,2);
	    
	        int sum = firstNumber + secondNumber;
	        String result = Integer.toBinaryString(sum);
	        System.out.println(result);
	    }

	}

}
