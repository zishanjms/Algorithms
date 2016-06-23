package arrayAndStrings;

public class UniqueString {

	public static void main(String[] args) {

		String str = "018FE473765AC21BC2FE8921EC8B89B88954BF09D6532FF04C38880918B0D19F21FFDD8ADB9B2F6C1DD96104B95A5EC5351406D466ECEE847D676D7E59AEE7460D50EC1DF9AD202CAA5769B1FF2CE8363444FDB1953318EA713A3647C173D9BFF0";
		
		System.out.println("Is Giver String contains unique chars : " + isUniqueChars(str));
		
	}

	public static boolean isUniqueChars(String str)
	{
		if(str.length() >256) return false;
		
		char [] charArray = str.toCharArray();
		boolean [] letters = new boolean[256];
		
		for (int i = 0; i < charArray.length; i++)
		{	
			if(letters[charArray[i]] == false)
			{
				letters[charArray[i]] = true;
			}
			else
				return false;
		}
		return true;
	}
	
}
