package arrayAndStrings;

public class AnagramStringCheck {

	public static void main(String[] args) {

		String str1 = "018FE473765AC21BC2FE8921EC8B89B88954BF09D6532FF04C38880918B0D19F21FFDD8ADB9B2F6C1DD96104B95A5EC5351406D466ECEE847D676D7E59AEE7460D50EC1DF9AD202CAA5769B1FF2CE8363444FDB1953318EA713A3647C173D9BFF0";
		String str2 = "018FE473765AC21BC2FE8921EC8B89B88954BF09D6532FF04C38880918B0D19F21FFDD8ADB9B2F6C1DD96104B95A5EC5351406D466ECEE847D676D7E59AEE7460D50EC1DF9AD202CAA5769B1FF2CE8363444FDB1953318EA713A3647C173D9BFF0";
		
		System.out.println("is Both arrays are Anagram to each other: " + checkAnagramStrings(str1, str2));
		
	}

	public static boolean checkAnagramStrings(String str1, String str2)
	{
		if(str1.length() != str2.length()) return false;
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		int [] letters = new int[256];
		
		for (int i = 0; i < charArray1.length; i++) {
			letters[charArray1[i]]++;
		}
		
		for (int i = 0; i < charArray2.length; i++) {
			if(--letters[charArray2[i]] < 0) return false;
		}
		
		return true;
	}
	
}
