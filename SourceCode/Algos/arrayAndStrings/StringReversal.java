package arrayAndStrings;

public class StringReversal {

	public static void main(String[] args) {
		
		String str = "abcdefghijklmnopqrstuvwxyz0123456789^";
		
		System.out.println("Given String : "+ str);
		System.out.println("Reverse of the String: "+ reverseString(str) );
	}

	public static String reverseString(String str)
	{
		char [] charArray = str.toCharArray();
		int j=str.length()-1;

		for (int i = 0; i < j; i++,j--) {
			char temp = charArray[j];
			charArray[j] = charArray[i];
			charArray[i] = temp;
		}
		
		return new String(charArray);
	}
	
}
