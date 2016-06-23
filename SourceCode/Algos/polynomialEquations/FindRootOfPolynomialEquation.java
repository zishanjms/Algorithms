package polynomialEquations;

public class FindRootOfPolynomialEquation {

	public static void main(String[] args) {
		// n2+n-20=0
		
		int a=1;
		int b=1;
		int c=-20;
		
		double x1= (-b+Math.sqrt(Math.pow(b, 2)- 4*a*c))/2*a;
		double x2= (-b-Math.sqrt(Math.pow(b, 2)- 4*a*c))/2*a;		
		System.out.println("Roots of equations are: "+x1 +" & "+x2);
		
	}

}
