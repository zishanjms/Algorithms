package challenge.altimetrik;

public class BulletPathProblem {

	public static void main(String[] args) {
		
		long m1, c1, m2, c2;

	    int x1=0, y1=0, x2=5, y2=0;
	    int x3=0, y3=0, x4=3, y4=-3;

	    System.out.println(isBulletPathProblemExists(x1, y1, x2, y2, x3, y3, x4, y4));
	    
	   /* //System.out.println(get_line_intersection(x1, y1, x2, y2, x3, y3, x4, y4));
	    
	    long dx, dy;

	    long intersection_X, intersection_Y;

	 
	    System.out.println(" Program to find the intersecting point of two lines:\n");
	 
	    dx = x2 - x1;
	    dy = y2 - y1;
	    if(dx!=0)
	    m1 = dy / dx;
	    else
	    	m1 = 0;
	    // y = mx + c
	    // intercept c = y - mx
	    c1 = y1 - m1 * x1; // which is same as y2 - slope * x2

	    dx = x4 - x3;
	    dy = y4 - y3;
	    if(dx!=0)
		    m2 = dy / dx;
		    else
		    	m2 = 0;
	    c2 = y4 - m2 * x3; // which is same as y2 - slope * x2

	 

	    System.out.println("Equation of line1: ");

	    System.out.println( m1 + "X " + ((c1 < 0) ? ' ' : '+') + c1 + "\n");

	   

	    System.out.println("Equation of line2: ");

	    System.out.println( m2 + "X " + ((c2 < 0) ? ' ' : '+') + c2 + "\n");

	    if( (m1 - m2) != 0)
	    	System.out.println( "No Intersection between the lines\n");
	    else
	    {

	        intersection_X = (c2 - c1) / (m1 - m2);

	        intersection_Y = m1 * intersection_X + c1;

	        System.out.println("Intersecting Point: = ");

	        System.out.println(intersection_X);

	        System.out.println(intersection_Y);

	    }
*/
	}

	
	public static boolean isBulletPathProblemExists(int x1, int y1, int x2, int y2, 
		    int x3, int y3, int x4, int y4){
		
		boolean result = false;
				int A1 = y2-y1;
				int B1 = x1-x2;
				int C1 = A1*x1+B1*y1;
				
				int A2 = y4-y3;
				int B2 = x3-x4;
				int C2 = A2*x3+B2*y3;
				
				int det = A1*B2 - A2*B1;
			    if(det == 0){
			      result = true;
			    }else{
			        int x = (B2*C1 - B1*C2)/det;
			        int y = (A1*C2 - A2*C1)/det;
			        System.out.println("Intersection Point is: X: "+ x +" Y: "+y);
			        if(x==x1 && y == y1)
		            	result = true;
		            else if(x==x2 && y == y2)
		            	result = true;
		            else if(x==x3 && y == y3)
		            	result = true;
		            else if(x==x4 && y == y4)
		            	result = true;
		            else
		            	result = false;
			    } 
				return result;
	}
	
	public static boolean get_line_intersection(long p0_x, long p0_y, long p1_x, long p1_y, 
		    long p2_x, long p2_y, long p3_x, long p3_y)
		{
			long i_x; long i_y;
			long s1_x, s1_y, s2_x, s2_y;
		    s1_x = p1_x - p0_x;     s1_y = p1_y - p0_y;
		    s2_x = p3_x - p2_x;     s2_y = p3_y - p2_y;

		    long s, t;
		    s = (-s1_y * (p0_x - p2_x) + s1_x * (p0_y - p2_y)) / (-s2_x * s1_y + s1_x * s2_y);
		    t = ( s2_x * (p0_y - p2_y) - s2_y * (p0_x - p2_x)) / (-s2_x * s1_y + s1_x * s2_y);

		    boolean result = true;
		    if (s >= 0 && s <= 1 && t >= 0 && t <= 1)
		    {
		        // Collision detected
		        	result = false;
		            i_x = p0_x + (t * s1_x);
		            i_y = p0_y + (t * s1_y);
		            
		            if(i_x==p0_x && i_y == p0_y)
		            	result = true;
		            else if(i_x==p1_x && i_y == p1_y)
		            	result = true;
		            else if(i_x==p2_x && i_y == p2_y)
		            	result = true;
		            else if(i_x==p3_x && i_y == p3_y)
		            	result = true;
		            
		    }

		    return result; // No collision
		}
}
