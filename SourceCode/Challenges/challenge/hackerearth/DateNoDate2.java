package challenge.hackerearth;

import java.util.Scanner;

public class DateNoDate2 {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] weight = new int[32];
		
		for(int t=0; t<T; t++)
		{
			String input = sc.next();
			String[] inputs = input.split(":");
			String conversation  = sc.nextLine();
			String[] converse = conversation.split(" ");
			for(String str : converse)
			{
				if(isNumber(str)){
					int num = Integer.parseInt(str);
					if(num<1 || num >31){
						continue;
					}
					else{
						if("G".equals(inputs[0]))
						{
							weight[num] +=2;
						}
						else{
							weight[num] +=1;
						}
					}
				}
			}
			
		}
		
		int max = Integer.MIN_VALUE;
		int nxtMax = Integer.MIN_VALUE;
		for(int i=1; i<weight.length; i++){
			if(max < weight[i]){
				max = weight[i];
			}
			else if(nxtMax < weight[i]){
				nxtMax = weight[i];
			}
		}
		
		if(max == nxtMax){
			System.out.println("No Date");
		}
		else{
			System.out.println("Date");
		}
    }
    
    private static boolean isNumber(String str)
    {
    	try{
    		Integer.parseInt(str);
    	}
    	catch(NumberFormatException e){
    		return false;
    	}
    	
    	return true;
    }
}
