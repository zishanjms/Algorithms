package bitManipulation;

import java.util.BitSet;

public class BitUtility {

	public static BitSet convertIntegerToBinary(int digit)
	{
		BitSet binary = new BitSet();
		int i=1,j,quotient=digit;
		
		while(quotient!=0)
		{
			binary.set(quotient%2);
			quotient = quotient/2;
		}
		
		return binary;
	}
	
	public static int convertBinaryToInteger(BitSet binary)
	{
		int digit=0;
	
		byte [] byteArray = binary.toByteArray();
		for (int i = 0; i < byteArray.length; i++) {
			digit += (byteArray[i]%10)*Math.pow(2, i);
		}
		
		
		return digit;
	}
}
