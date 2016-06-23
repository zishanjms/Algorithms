package arrayAndStrings;

public class ReplaceSpaceInString {

	public static void main(String[] args) {

		String str = "This is my Room        ";
		int strinLength=15;
		System.out.println("Replace space in string: "+ replaceSpaceInString(str.toCharArray(), strinLength));
		
	}

	public static String replaceSpaceInString(char[] str, int lengthOfString)
	{
		int spaceCounter=0;
		for (int i = 0; i < lengthOfString; i++) {
			if(str[i] == ' ')
			spaceCounter++;
		}
				
		int newLength = lengthOfString + spaceCounter *2;
		str[newLength] = '\0';
		
		for (int i = lengthOfString -1; i >= 0; i--) {
			
			if(str[i] == ' ') 
			{
				str[newLength-1]='0';
				str[newLength-2]='2';
				str[newLength-3]='%';
				newLength-=3;
			}
			else
			{
				str[newLength-1] = str[i];
				newLength-=1;
			}
		}
		
		
		return new String(str);
	}
}
