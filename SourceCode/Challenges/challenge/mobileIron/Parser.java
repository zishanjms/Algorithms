package challenge.mobileIron;

import java.util.Stack;

public class Parser {
	
	
	 public static boolean checkParenthesisBalance( String parent )
	    {
	        boolean result = true;
	        
	        char[] charArr = parent.toCharArray();
	        Stack<Character> stack = new Stack<Character>();
	        
	        for(int i=0; i<charArr.length; i++)
	        {
	            char currentChar = charArr[i];
	            if( currentChar == '{' || currentChar == '[' || currentChar == '(' )
	            {
	                stack.push(currentChar);
	            }
	            else
	            {
	                if( currentChar == '}' || currentChar == ']' || currentChar == ')' )
	                {
	                    char prevChar = stack.pop();
	                    
	                    if( currentChar == '}' && prevChar != '{' )
	                    {
	                        result  =  false;
	                        break;
	                    }
	                    else if( currentChar == ']' && prevChar != '[' )
	                    {
	                        result  =  false;
	                        break;
	                    }
	                    else if( currentChar == ')' && prevChar != '(' )
	                    {
	                        result  =  false;
	                        break;
	                    }
	                 
	                }
	                else
	                {
	                    result  =  false;
	                    break;
	                }
	            }
	            
	        }
	        
	        if(!stack.isEmpty())
	        {
	            result = false;
	        }
	        
	        return result;
	    } 

	public static void main(String[] args) {
		Parser x =  new Parser();
		System.out.println(x.checkParenthesisBalance("{}["));

	}

}
