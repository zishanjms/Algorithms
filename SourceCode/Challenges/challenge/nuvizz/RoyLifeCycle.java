package challenge.nuvizz;

import java.util.Scanner;

public class RoyLifeCycle {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] input = new String[N];
        for(int i=0; i<N; i++)
        {
        	input[i] = sc.next();	
        }
        
        int maxNDayCount = Integer.MIN_VALUE;
        int maxDCount = Integer.MIN_VALUE;
        int previousCCount = 0;

        for(int i=0; i<N; i++)
        {
        	
        	int start =0; int end = 0;
        	int currCount = 0;
        	int maxDayCount = Integer.MIN_VALUE;
        	
        	for(int j=0; j< input[i].length(); j++)
        	{
        		
        		
        		if( input[i].charAt(j) == 'C' )
        		{
        			start = j;
        			end = j;
        			while( j+1 <input[i].length() && input[i].charAt(++j) == 'C' )
        			{
        				end++;
        			}
        			currCount = end - start + 1;
        			if(start == 0 && previousCCount > 0 )
        			{
        				int currentMaxStreak = previousCCount + currCount;
        				if(currentMaxStreak > maxNDayCount )
        				{
        					maxNDayCount = currentMaxStreak;
        				}
        			}
        				
        			if( currCount > maxDayCount )
        			{
        				maxDayCount = currCount;
        			}
        			
        			if( j == input[i].length()-1 && input[i].charAt(j) == 'C' )
            		{
            			previousCCount = currCount;
            		}
        		}
        		
        	}
        	 
        	if( maxDayCount > maxDCount )
			{
        		maxDCount = maxDayCount;
			}
        } 
        
        System.out.println(maxDCount + " " + Math.max(maxDCount, maxNDayCount));
    }

}
