package dynamicProgramming;

public class CoinChangeProblemSolnUsingDyn {

	
	
	public static void main(String[] args) {
		
		int [] valueList = new int[3];
		
		valueList[0] = 1;
		valueList[1] = 2;
		valueList[2] = 6;
		
		
		
		int P=10009;
		
		int result = countMinCoin(P, valueList);
		System.out.println("Final Result is :: "+result );
		
	}
	
	
	public static int countMinCoin(int P, int [] valueList)
	{
		int M[] = new int[P+1];
		int [] sol = new int[valueList.length];
		int [] mysol = new int[valueList.length];
		
		for (int k = 1; k <= P; k++) {
			
			for (int i = 0; i < mysol.length; i++) {
				mysol[i] =-1;
			} // set all elements to -1 for mysol array
			
			for (int i = 0; i < mysol.length; i++) {
				
				if(valueList[i]<=k)
				{
					sol[i] = M[k-valueList[i]];
					mysol[i] = sol[i] +1;
				}
			}
			
			M[k] =-1;
			for (int i = 0; i < mysol.length; i++) {
				
				if(mysol[i]>0)
				{
					if(M[k]==-1 || M[k]>mysol[i])
					{
						M[k] = mysol[i];
					}
				}
			}
			
		}
		
		return M[P]; 
	}
}
