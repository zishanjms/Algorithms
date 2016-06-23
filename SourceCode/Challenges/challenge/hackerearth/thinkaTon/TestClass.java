package challenge.hackerearth.thinkaTon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestClass {

	    public static void main(String args[] ) throws Exception {
	      
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        long N = (long)Math.pow(10, n);
	        long counter=0;
	        /*HashMap<Long, Integer> cache = new HashMap<Long, Integer>();
	        
	        for(long i=0; i<=N; i++){
	        	long value = getSumOfSquareOfDigits(i);
	        	if(!cache.containsKey(value)){
	        		cache.put(value, 1);
	        	}
	        	else{
	        		cache.put(value, cache.get(value)+1);
	        	}
	        }
	        
	        for (Map.Entry<Long, Integer> entry : cache.entrySet()) {
	            Long key = entry.getKey();
	            Integer value = entry.getValue();
	            counter += value * value;
	            // ...
	        }*/
	        
	        for(long i=0; i<=N; i++){
	        	for(long j=0; j<=N; j++){
	        		
	        		if(getSumOfSquareOfDigits(i) == getSumOfSquareOfDigits(j)){
	        			System.out.println("(" + i + " , " + j + ")");
	        			counter++;
	        			
	        		}
	        	}
	        }
			int modulo = ((int)Math.pow(10,9)) +7;
	        System.out.println(counter%modulo);
	    }
	    
	    public static long getSumOfSquareOfDigits(long no){
	    	long sum =0;
	    	while(no>0){
	    		long digit = no%10;
	    		sum += digit * digit;
	    		no = no/10;
	    	}
	    	
	    	return sum;
	    }
}
