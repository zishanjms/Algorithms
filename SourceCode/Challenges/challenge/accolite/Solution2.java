package challenge.accolite;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			Integer value = scanner.nextInt();
			array.add(value);
		}
		
		double denominator = 0;
		double numberOfPerfectSqure = 0;
		while(array.size()>0){
			int randomNumber = getRandomNumberBetweenRange(0, array.size()-1);
			int number1 = array.get(randomNumber);
			array.remove(number1);
			if(array.size()==0){
				break;
			}
			randomNumber = getRandomNumberBetweenRange(0, array.size()-1);
			int number2 = array.get(randomNumber);
			
			array.remove(number2);
			long prod = number1 * number2;
			denominator++;
			if(checkPerfectSquare(prod)){
				numberOfPerfectSqure++;
			}
		}
		Double probability = numberOfPerfectSqure/denominator;
		
		System.out.printf("%1.6f",probability);
	}

	public static boolean checkPerfectSquare(long number){
		boolean result = false;
		int sqrt = (int) Math.sqrt(number);
        if(sqrt*sqrt == number) {
            result = true;
        }
        return result;
	}
	public static int getRandomNumberBetweenRange(int lower, int higher){
		 Random rand = new Random();
		 return rand.nextInt((higher - lower) + 1) + lower;
	}
}
