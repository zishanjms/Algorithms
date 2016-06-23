package challenge.topcoder;

public class FindMinPositiveSum {

	public static void main(String[] args) {
		int S[]={1,4,2,7};
	     System.out.println(MinNumber(S));


	}
	
	public static int MinNumber(int S[]) {
        int n = 4;
        int N = 1<<n;
        int M[] = new int[2000010];
       
        for (int s = 0; s < N; s++) {
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                if (((1<<i)&s) == 1) {  //This is the trick
                    sum+= S[i];
                }
            }
            M[sum] = 1;
        }
        for (int i = 1; ; i++) {
        	System.out.println(M[i]);
            /*if (M[i] !=1) {
                return i;
            }*/
        }
    }


}
