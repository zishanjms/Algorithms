/*package bitManipulation;

public class ReplaceNwithMusingItoJBits {

	public static void main(String[] args) {
		
		String n = "100000000";
		String m = "10011";
		int i=2;
		int j=6;
		
		int N = BitUtility.convertBinaryToInteger(n);
		int M = BitUtility.convertBinaryToInteger(m);
		
		int result  =  updateBits(N, M, i, j);
		System.out.println("Final Output: "+ BitUtility.convertIntegerToBinary(result));
		int allones = ~BitUtility.convertBinaryToInteger("00000000");
		System.out.println("All ones "+BitUtility.convertIntegerToBinary(allones));
		int left = allones<<(8-j+1);
		System.out.println("left of input mask is: "+BitUtility.convertIntegerToBinary(left));
		allones = ~0;
		int right = allones>>i;
		System.out.println("right of input mask is: "+BitUtility.convertIntegerToBinary(right));

		int mask = left & right;
		System.out.println("INput Mask is: " +BitUtility.convertIntegerToBinary(mask));
		
		M = M<<i;
		
		System.out.println("Value of M after shifting: " + BitUtility.convertIntegerToBinary(M));
		

		int result  = (~mask & N) | (mask & M);
		System.out.println("Final Output: "+ BitUtility.convertIntegerToBinary(result));
		
		
		
	}

	
	public static int updateBits(int n, int m, int i, int j)
	{
		int allones = ~0;
		int left = allones<<(j+1);
		
		int right = ((1<<i)-1);
		int mask = left | right;
		
		int n_clearedBits = n & mask;
		int m_shifted = m<<i;
		
		return n_clearedBits | m_shifted;
	}
	
}
*/