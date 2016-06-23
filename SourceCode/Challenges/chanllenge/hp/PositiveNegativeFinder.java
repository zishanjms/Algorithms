package chanllenge.hp;

public class PositiveNegativeFinder {

	public static void main(String[] args) {
		System.out.println(isPositive(0));

	}

	
	public static int isPositive(int x){
		 return ((x>>31)&1);
	}
}
