package challenge.hackerearth.thinkaTon;

public class SubstrinFind {

	public static void main(String[] args) {
		String str = "pvmupwjjjf";
		char[] charArr = str.toCharArray();
		
		int counter=0;
		for(int i=0; i<charArr.length-1; i++){ 
			for(int j=charArr.length-1; j>i; j--){
				if(charArr[i] == charArr[j]){
					counter++;
					int k=0;
					while(i+1 != j-k){
						String str1 = str.substring(i, j-k);
						String str2 = str.substring(i+1+k, j+1);
						if(isStringAnagram(str1, str2)){
							counter++;
						}
						k++;
					}
				}
			}
			
		}
		
		System.out.println(counter);
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
