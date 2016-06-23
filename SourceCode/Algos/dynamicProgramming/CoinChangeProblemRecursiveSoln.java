package dynamicProgramming;

public class CoinChangeProblemRecursiveSoln {

	public static void main(String[] args) {

		int [] availableCoin = new int[3];
		
		availableCoin[0]=1;
		availableCoin[1]=2;
		availableCoin[2]=3;
		
		int P = 5;
		
		int result = countCoin(availableCoin,P);
		
		System.out.println("final result:: "+ result);
		
	}

	public static int countCoin(int arrayList[], int P)
	{
		int [] sol, mysol;
		int myfinalSoln;
		
		 sol = new int[arrayList.length];
		 mysol = new int[arrayList.length];
		
		 if(P==0)
		 {
			 return 0;
		 }
		 
		for (int j = 0; j < mysol.length; j++) {
			
			mysol[j]= -1;
		}
		
		for (int i = 0; i < mysol.length; i++) {
			
			if(arrayList[i]<=P)
			{
				sol[i] = countCoin(arrayList, P-arrayList[i]);
				mysol[i] = sol[i] +1;
				System.out.println("Value of P: "+P+" Value of i: "+i+" mysol "+mysol[i]);
			}
		}
		
		myfinalSoln =-1;
		for (int i = 0; i < mysol.length; i++) {
			
			if(mysol[i]>=0)
			{
				if(myfinalSoln ==-1 || myfinalSoln>mysol[i])
				{
					myfinalSoln = mysol[i];
				}
			}
		}
			
		
		
		return myfinalSoln;
	}
}
