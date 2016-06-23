package challenge.nutanix;


public class Solution {

	public static void main(String[] args) {
		int [] inputs = {2,5,1,8};
		getPosition("a2b3c2a1", inputs);

	}

	public static void getPosition(String compressedString, int[] inputs){
		
		if(compressedString.length()==0 || compressedString.length()>10000) return;
		
		char[] charArray = compressedString.toCharArray();
		StringBuilder newString= new StringBuilder();
		
		char previousChar = charArray[0];
		StringBuilder charCounter = new StringBuilder();
		
		for (int i = 1; i < charArray.length; i++) {
			
			if(charArray[i]>96 && charArray[i]<123)
			{
				int charCounterInt = Integer.parseInt(charCounter+"");
				while(charCounterInt>0)
				{
					newString.append(previousChar);
					charCounterInt--;
				}
				previousChar = charArray[i];
				charCounter = new StringBuilder();
			}
			else
			{
				charCounter.append(charArray[i]);
			}
			
		}
		
		int charCounterInt = Integer.parseInt(charCounter+"");
		while(charCounterInt>0)
		{
			newString.append(previousChar);
			charCounterInt--;
		}
		
		if(newString.length()>(int) Math.pow(10, 18)) return;
		
		char[] stringToSort = newString.toString().toCharArray();
		sortCharArray(stringToSort);
		System.out.println(stringToSort);
		
		for (int i = 0; i < inputs.length; i++) {
			if(inputs[i]<=stringToSort.length)
				System.out.println(stringToSort[inputs[i]-1]);
			else
				System.out.println(-1);
		}
		 
	}
	
	public static void sortCharArray(char[] charArray){
		for(int i=0; i< (charArray.length - 1); ++i) {

			   for(int j = i + 1; j > 0; --j) {
			    if(charArray[j] < charArray[j-1]) {
			     //Swaps the values
			     char temp = charArray[j];
			     charArray[j] = charArray[j - 1];
			     charArray[j - 1] = temp;
			    }
			   }
			  }
		
	}
	
}
