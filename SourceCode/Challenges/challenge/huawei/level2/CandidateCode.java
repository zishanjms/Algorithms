package challenge.huawei.level2;

public class CandidateCode {

	public static void main(String[] args) {
		
		String[] input1={"1#2","2#4","3#1","4#5","5#3","6#6"};
		int input2 = input1.length;
		
		int result = bridge_count(input1, input2);
		
		System.out.println("Final result is: "+ result);

	}
	
	public static int bridge_count(String[] input1,int input2)
    {
        int nbrOfNonCrossingBridges=0;
        
		int previous=Integer.MIN_VALUE;
		for (int i = 0; i < input2; i++) {
			
			try{
					int element = Integer.parseInt((input1[i].split("#"))[1]);
					
					if(element>previous)
						nbrOfNonCrossingBridges++;
					
					previous = element;
				}
				catch(Exception e)
				{
					//swallow
				}
			
		}
				
        return nbrOfNonCrossingBridges;
    }

}
