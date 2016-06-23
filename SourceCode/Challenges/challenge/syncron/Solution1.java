package challenge.syncron;

public class Solution1 {

	public static void main(String[] args) {
		/*System.out.println(solution("011100"));
		System.out.println(solution("011100"));
		*/
		System.out.println(solution("111100"));
		//System.out.println(mySoln("011100"));
	}
	
	public static int mySoln(String str)
	{
		int counter=0;
		int binary = Integer.parseInt(str);
		
		while(binary!=0)
		{
			if((binary&1)==1)
			{
				binary = binary&1;
				counter++;
			}
			else
			{
				binary = binary >> 1;
				counter++;
			}
		}
		
		return counter;
		
	}
	
	public static int solution(String str)
	{
		char [] charArray  = str.toCharArray();
		int decimal=0;
		int count=0;
		decimal = Integer.parseInt(str, 2);
		/*for (int i = charArray.length -1; i >= 0; i--) {
			decimal += Math.pow(2, count++) * Integer.parseInt(charArray[i]+"");
		}*/
		/*int binary = Integer.parseInt(str);
		int decimal=0, power=0;
	
		while(true)
		{
			if(binary==0)
				break;
			else
			{
				int temp = binary%10;
				decimal += temp*(1<<power);
				binary = binary/10;
				power++;
			}
		}*/
		
		int counter=0;
		
		while(decimal>0)
		{
			System.out.println(decimal);
			if(decimal%2==0)
			{
				decimal = decimal/2;
			}
			else
			{
				decimal =decimal-1;
			}
				counter++;
				
		}
		
		return counter;
	}

}
