package challenge.hackerearth.thinkaTon;

import java.util.*;
import java.util.Scanner;

public class AnagramSubStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int testNo = scanner.nextInt();
        for(int t=0; t<testNo; t++){
            String str = scanner.next();
            char[] charArr = str.toCharArray();
    		
    		int counter=0;
    		for(int i=0;i<str.length()-1;i++)
            {
                List<String> list = new ArrayList<String>();
                for(int j=0;j<str.length()-i;j++)
                {
                    list.add(str.substring(j,j+i+1));
                }
                

                counter += getAnagram(list);

            }
    		
    		System.out.println(counter);
        }

	}
	
	public static int getAnagram(List<String> list){
		int counter=0;
	    for(int i=0;i<list.size()-1;i++)
	    {
	        String temp = list.get(i);

	        for(int j=i+1;j<list.size();j++)
	        {
	        	
	        	if(isStringAnagram(temp, list.get(j))){
	        		counter++;
	        	}
	        }
	    }
	    return counter;
	}

	
	public static boolean isStringAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        int[] letters = new int[26];
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();
        
        for(int i=0; i<charArr1.length; i++){
            letters[charArr1[i]-'a']++;
        }
        
        for(int i=0; i<charArr2.length; i++){
            if(--letters[charArr2[i]-'a']<0){
                return false;
            }
        }
        return true;
    }
}
