package arrayAndStrings;

public class StringCompression {

	public static void main(String[] args) {

		String str = "abcdreg";
		System.out.println("compressed string is: "+ compression(str));
	}

	public static String compression(String str)
	{
		char [] charArray = str.toCharArray();
		StringBuilder newStr = new StringBuilder();
		char currentChar = charArray[0];
		int charCounter = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i] == currentChar)
			{
				charCounter++;
			}
			else
			{
				newStr.append(currentChar).append(charCounter);
				currentChar = charArray[i];
				charCounter=1;
			}
		}
		newStr.append(currentChar).append(charCounter);
		
		if(newStr.length() >= charArray.length)
			return str;
		
		return newStr.toString();
	}
}
