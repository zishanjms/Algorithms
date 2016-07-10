package challenge.hackerearth;

public class MergeString {

	public static void main(String[] args) {
		String a = "abc";
		String b = "defgh";

		System.out.println(mergeString(a, b));
	}
	
	public static String mergeString(String a, String b){
		StringBuilder str = new StringBuilder();
		int l1= a.length(); int l2 = b.length();
		int i=0,j=0;
		while( i < l1 && j < l2){
			str.append(a.charAt(i++));
			str.append(b.charAt(j++));
		}
		
		while(j < l2 ){
			str.append(b.charAt(j++));
		}
		
		while(i < l1 ){
			str.append(a.charAt(i++));
		}
		
		return str.toString();
	}

}
