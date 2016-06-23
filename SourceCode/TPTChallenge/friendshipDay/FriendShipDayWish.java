package friendshipDay;

public class FriendShipDayWish {

	public static void main(String[] args) {
		double x, y, size=10;
	    char ch=3;
	    String message = " HAPPY FRIENDSHIP DAY ";
	    int print_line = 4;


	    if (message.length() % 2 != 0) message += " ";


	    for (x=0;x<size;x++)
	    {
	        for (y=0;y<=4*size;y++)
	        {
	            double dist1 = Math.sqrt( Math.pow(x-size,2) + Math.pow(y-size,2) );
	            double dist2 = Math.sqrt( Math.pow(x-size,2) + Math.pow(y-3*size,2) );


	            if (dist1 < size + 0.5 || dist2 < size + 0.5 ) {
	                System.out.print(ch);
	            }
	            else System.out.print(" ");
	        }
	        System.out.print("\n");
	    }
	    char [] charArray = message.toCharArray();
		print_line = 4;
	    for (x=1;x<2*size;x++)
	    {
	        for(y=0;y<x;y++) System.out.print(" ");


	        for (y=0; y<(((4*size) + 1)-(2*x)); y++)
	        {
	            if (x >=print_line-1 && x <=print_line+1)
				{
	                int idx =(int)(y-((4*size)-(2*x)-(charArray.length))/2);
	                if (idx < message.length() && idx >= 0) {
	                    if (x == print_line) System.out.print(charArray[idx]);
	                    else System.out.print(" ");
	                }
	                else System.out.print(ch);
	            }
	            else System.out.print(ch);
	        }
	        System.out.println();
	    }

	}

}
