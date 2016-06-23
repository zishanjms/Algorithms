package challenge.amazon;

import java.util.HashMap;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {

        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        /*System.out.println(getGCD(1));
        System.out.println(getGCD(2));
        System.out.println(getGCD(3));
        System.out.println(getGCD(4));
        System.out.println(getGCD(5));
        System.out.println(getGCD(6));
        System.out.println(getGCD(7));
        System.out.println(getGCD(8));*/
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] arr = new int[N+1];
		HashMap<Integer, Integer > gcdmap = new HashMap<Integer, Integer>();
		
        for(int i=1; i<=N; i++){
        	arr[i] = scanner.nextInt();
        	if(!gcdmap.containsKey(arr[i])){
        		int gcd = getGCD(arr[i]);
        		gcdmap.put(arr[i], gcd);
        	}
        }
        
        int Q = scanner.nextInt();
        
        for(int i=0; i<Q; i++){
			String input = scanner.next();
			int start = Integer.parseInt(scanner.next());
			int end = Integer.parseInt(scanner.next());
			
			if("C".equals(input)){
				int result = 0;
				for(int j = start; j<=end; j++){
					result += gcdmap.get(arr[j]);
				}
				System.out.println(result);
			}
			else if("U".equals(input)){
				arr[start] = end;
				int gcd = getGCD(end);
        		gcdmap.put(arr[start], gcd);
			}
			
        }
        
        
	}

	public static int getGCD(int k){
    	int gcd = 0;
    	for(int j=1; j<=k; j++){
    		gcd += gcd(j, k);		
    	}
    	return gcd%1000000007;
    }
    
    public static int gcd(int a, int b){
    	if(a == 0 || b == 0 ) return a+b;
    	return gcd(b, a%b);
    }
}
