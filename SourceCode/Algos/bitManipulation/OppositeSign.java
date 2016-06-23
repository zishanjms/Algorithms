package bitManipulation;

import java.util.BitSet;

public class OppositeSign {

	public static void main(String[] args) {
		int a=23;
		int b=34;
		
		BitSet aBit = BitUtility.convertIntegerToBinary(a);
		BitSet bBit = BitUtility.convertIntegerToBinary(b);	
		BitSet zeroBit = new BitSet(1);
		aBit.xor(bBit);
		//System.out.println("output:: " + (zeroBit.clear()));

	}

}
