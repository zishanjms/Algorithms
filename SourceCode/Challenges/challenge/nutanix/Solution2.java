package challenge.nutanix;

public class Solution2 {

	
	public static void main(String[] args) {
		
		getInputTestString(100);

	}

	public static void getInputTestString(int total){
		
		if(total>100) return;
		
		String[] testStrings = new String[total];
		
		char[] inputChars = {'a','b','c','d','e'};
		StringBuilder newString = new StringBuilder();
		
		for (int i = 0; i < total; i++) {
		
		int lengthOfString = getRandomStringLength();
		for (int j = 0; j < lengthOfString; j++) {
			
			newString.append(inputChars[getRandomCharacter()]);
			
		}	
			testStrings[i] = newString.toString();
		}
		
		for (int i = 0; i < testStrings.length; i++) {
			System.out.println(testStrings[i]);
		}
		
	}
	
	public static int getRandomCharacter()
	{
		return 0 + (int)(Math.random() * (0+4+1));
	}
	
	public static int getRandomStringLength()
	{
		return 0 + (int) (Math.random() * (0+100+1));
	}
}
