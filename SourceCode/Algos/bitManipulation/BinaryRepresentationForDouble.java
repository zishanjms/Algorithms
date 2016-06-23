package bitManipulation;

public class BinaryRepresentationForDouble {

	public static void main(String[] args) {

		System.out.println("Final Output is: "+ getBinaryForDouble(0.1));
	}

	public static String getBinaryForDouble(double num)
	{
		if(num>=1 || num<=0)
		{
			return "ERROR";
		}
		StringBuilder buffer = new StringBuilder();
		buffer.append(".");
		
		while(num>0)
		{
			/*if(buffer.length()>=32)
			{
				return "ERROR";
			}*/
			
			double r = num * 2;
			if(r>=1)
			{
				buffer.append("1");
				num = r-1;
			}
			else
			{
				buffer.append("0");
				num=r;
			}
		}
		
		return buffer.toString();
	}
}
