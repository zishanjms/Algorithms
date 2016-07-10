package challenge.amazon;

import java.io.IOException;
import java.util.Scanner;

public class ChocolateBox {

	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] input = new int[N];
		int[] sol = new int[N];
		input[0] = sc.nextInt();
		sol[0] = input[0];
		for (int i = 1; i < input.length; i++) {
			input[i] = sc.nextInt();
			sol[i] = sol[i-1] + input[i];
		}
	
		int q = sc.nextInt();
		
		for(int i=0; i<q; i++){
			int query = sc.nextInt();
			System.out.println(getBoxOfIndex(sol, query));
		}
	}
	
	public static int getBoxOfIndex(int[] sol, int i)
	{
		return getBoxNumberRec(sol, i, 0, sol.length-1)+1;
	}
	
	public static int getBoxNumberRec(int[] sol, int i, int low, int high)
	{
		if(high<low) return -1;
		int mid = low + (high - low )/2;
		
		if(i == sol[mid] || ( ((mid-1) > -1) && i < sol[mid] && i > sol[mid-1]) || ( mid == 0 && i < sol[mid] )) return mid;
		if(i < sol[mid] ) return getBoxNumberRec(sol, i, low, mid-1);
		else return getBoxNumberRec(sol, i, mid+1, high);		
	}
}

