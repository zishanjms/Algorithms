package anagram;

import java.util.ArrayList;

public class GenerateStringAllPermutations {

	public static void main(String[] args) {

		String str = "12345";
		
		ArrayList<String> allStringPermutations = getPermutations(str);
		
		System.out.println();
		
		for (int i = 0; i < allStringPermutations.size(); i++) {
			System.out.println(allStringPermutations.get(i));
		}
	}
	
	public static ArrayList<String> getPermutations(String str)
	{
		if(str==null)
		{
			return null;
		}
		ArrayList<String> permutations = new ArrayList<>();
		if(str.length()==0)
		{
			permutations.add("");
			return permutations;
		}
		
		char first = str.charAt(0);
		String remainder = str.substring(1);
		
		ArrayList<String> words = getPermutations(remainder);
		for(String word : words)
		{
			for(int i=0; i<= word.length(); i++)
			{
				String newCombination = insertCharAt(word, first, i);
				permutations.add(newCombination);
			}
		}
		
		return permutations;
		
	}

	public static String insertCharAt(String word, char firstChar, int index)
	{
		String prefix = word.substring(0,index);
		String suffix = word.substring(index);
		return prefix + firstChar + suffix;
	}
}
