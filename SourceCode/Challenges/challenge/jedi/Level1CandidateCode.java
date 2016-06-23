package challenge.jedi;

import java.util.*;

public class Level1CandidateCode {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input1 = scanner.next();

		System.out.println(constructTree(input1));
	}

	public static String constructTree(String input1){
		StringBuilder result = new StringBuilder();
		final Map<Character, Integer> letters = calculateFrequency(input1);
		
		List<Character> list = getSortedKeys(letters);
		
		for (Character str : list) {
            int frequency = letters.get(str);
            System.out.print(str + ":" + frequency + ", ");
        }
		
		HashMap<Character, String> encodedMap = generateEncodings(list);
		
		System.out.println(encodedMap);
		
		char[] charArray = input1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			result.append(encodedMap.get(charArray[i]));
		}
		
		return result.toString();
	}
	
	public static List<Character> getSortedKeys(final Map<Character, Integer> letters){
		List<Character> list = new ArrayList<Character>(letters.keySet());
		Collections.sort(list, new Comparator<Character>() {
		    @Override
		    public int compare(Character x, Character y) {
		        int result =  letters.get(y) - letters.get(x);
		        if(result!=0){
		        	return result;
		        }
		        else{
		        	return y-x;
		        }
		    }
		});
		return list;
	}
	
	public static HashMap<Character, String> generateEncodings(List<Character> list){
		HashMap<Character, String> encodedMap = new HashMap<Character, String>();
		
		StringBuilder encode =  new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			if(i==0){
				encode = new StringBuilder();
				encode.append('0');
			}
			else if(i==list.size()-1){
				int k=i;
				encode = new StringBuilder();
				while(k>0){
					encode.append("1");
					k--;
				}
			}
			else{
				int k=i;
				encode = new StringBuilder();
				while(k>=0){
					if(k==0){
						encode.append("0");
					}
					else{
						encode.append("1");
					}
					k--;
				}
			}
			encodedMap.put(list.get(i), encode.toString());
		}
		return encodedMap;
	}
	
	public static Map<Character, Integer> calculateFrequency(String input1){
		Map<Character, Integer> letters = new HashMap<Character, Integer>();
		char[] charArray = input1.toCharArray();
		
		for(char ch : charArray){
			if(!letters.containsKey(ch)){
				letters.put(ch, 1);
			}
			else{
				letters.put(ch, letters.get(ch)+1);
			}
		}
		
		return letters;
	}
}
