package challenge.mobileIron;

import java.util.Scanner;
import java.util.Stack;

public class Solution1 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int N = scanner.nextInt();
		 String[] values = new String[N];
		 
		 for(int i=0; i<N; i++){
			 values[i] = scanner.next();
		 }
		 String[] finalResult = Braces(values);
		 for(String result : finalResult){
			 System.out.println(result);
		 }
		//System.out.println(Braces(values));

	}
	
	static String[] Braces(String[] values) {
        Stack<Character> stack = new Stack();
        String[] result = new String[values.length];
        
        for(int t=0; t<values.length; t++){
        	
        	String input = values[t];
        	char[] charArr = input.toCharArray();
        	boolean check = true;
        	
        	for(int i=0; i<charArr.length; i++){
        		if(charArr[i] == '{' || charArr[i] == '(' || charArr[i] == '['){
        			stack.push(charArr[i]);
        		}
        		else if(charArr[i] == '}' || charArr[i] == ')' || charArr[i] == ']'){
        			if(stack.isEmpty()){
        				check = false;
        				break;
        			}
        			char poped = stack.pop();
        			if(charArr[i] == '}' && poped !='{'){
        				check = false;
        				break;
        			}
        			else if(charArr[i] == ']' && poped !='['){
        				check = false;
        				break;
        			}
        			else if(charArr[i] == ')' && poped !='('){
        				check = false;
        				break;
        			}
        		}
        			
        	}
        	
        	if(!stack.isEmpty()){
    			check = false;
    		}
    		
    		if(check == false){
    			result[t] = "NO";
    		}
    		else{
    			result[t] = "YES";
    		}
        	
        }
        return result;
    }
}
 