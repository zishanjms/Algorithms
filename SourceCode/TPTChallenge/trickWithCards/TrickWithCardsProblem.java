package trickWithCards;

public class TrickWithCardsProblem {

	public static void main(String[] args) {
		
		
		int T = 15;
		
		int[] N ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		int[] result = countMinFlips(T,N); 
		
		for (int i = 0; i < result.length; i++) {
			System.out.print("\t "+result[i]);
		}

	}

	public static int [] countMinFlips(int T, int []N)
	{
		int []result = new int[N.length];
		
		for (int i = 0; i < result.length; i++) {
			
			if(N[i]<=3)
			{
				result[i]=1;
			}
			else if((N[i]%3)==0)
			{
				result[i] = N[i]/3;
			}
			else
			{
				result[i] = N[i];
			}
		}
		
		return result; 
	}
}
