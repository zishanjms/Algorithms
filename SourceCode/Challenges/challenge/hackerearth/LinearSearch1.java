package challenge.hackerearth;

import java.util.*;

public class LinearSearch1 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++)
        {
        	String n = sc.next();
        	char[] charArr = n.toCharArray();
        	boolean result  = false;
        	char prev = 'a';
        	for(char c : charArr)
        	{
        		if(c == '1' && prev == '2')
        		{
        			System.out.println("The streak is broken!");
        			result = true;
        			
        		}
        		
        		prev = c;
        	}
        	int k = Integer.parseInt(n);
        	if( !result && k%21 == 0)
        	{
        			System.out.println("The streak is broken!");
        	}
        	else if(!result)
        	{
        			System.out.println("The streak lives still in our heart!");
        			
        	}
        
        }
    }

}
