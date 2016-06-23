package challenge.vizury;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] hi = new int[N];
        long[] li = new long[N];
        
        for(int i=0; i<N; i++){
        	hi[i] = sc.nextInt();
        	li[i] = sc.nextLong();
        }
        
        int[] soln = new int[N];
        for(int i=0; i<N; i++){
        	soln[i] = hi[i];
        }
        
        for(int i=1; i<N; i++){
        	for(int j=0; j<i; j++){
        		if(li[i]>= li[j])
        		soln[i] = Math.max(soln[i], soln[j] + hi[i]);
        	}
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
        	if(max<soln[i]){
        		max = soln[i];
        	}
        }
        
        System.out.println(max);
        
        /*int[] soln = new int[N];
        
        for(int i=0; i<N; i++)
        {
        	int prevMax = Integer.MIN_VALUE;
        	soln[i] = hi[i];
        	
        	for(int j=0; j<i; j++){
        		
        		if(li[i] >= li[j] && soln[j] > prevMax)
        		{
        			prevMax = soln[j];
        		}
        	}
        	

			if(hi[i] > 0 && prevMax > soln[i])
			{
				soln[i] = prevMax + hi[i];	
			}
			else if(prevMax > soln[i])
			{
				soln[i] = prevMax;
			}
        }
        System.out.println(soln[N-1]);*/
    }

}
