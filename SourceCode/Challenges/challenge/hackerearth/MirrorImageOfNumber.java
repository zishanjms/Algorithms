package challenge.hackerearth;

import java.util.Scanner;

public class MirrorImageOfNumber {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
        	String str = sc.next();
        	char[] charArr = str.toCharArray();
        	int j = charArr.length-1;
        	boolean result = true;
        	for(int i=0; i<=j; i++, j--){
        		if( !( charArr[i] == '0' || charArr[i] == '1' || charArr[i] == '8') || (charArr[i] != charArr[j])){
        			result = false;
        		}
        	}
        	
        	if(result){
        		System.out.println("YES");
        	}
        	else{
        		System.out.println("NO");
        	}
        	
        }
    }

}
