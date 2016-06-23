package challenge.jpmc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class Solution2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String s;
	    while ((s = in.readLine()) != null) {
	        boolean result = checkIfTwoRectanglesOverlap(s);
	        System.out.println(result);
	    }

	}
	
	public static boolean checkIfTwoRectanglesOverlap(String input){
	
		boolean result = false;
		
		String[] inputs = input.split(" ");
		
		// for first Rectangle
		int firstXcord = Integer.parseInt(inputs[0]);
		int firstYcord =  Integer.parseInt(inputs[1]);
		int firstWidth = Integer.parseInt(inputs[2]);
		int firstHeight = Integer.parseInt(inputs[3]);
		
		HashSet<Point> firstRectanglePoints = findAllPointsOfRectangle(firstXcord, firstYcord, firstWidth, firstHeight);
		
		// for second Rectangle
		int secondXcord = Integer.parseInt(inputs[4]);
		int secondYcord =  Integer.parseInt(inputs[5]);
		int secondWidth = Integer.parseInt(inputs[6]);
		int secondHeight = Integer.parseInt(inputs[7]);
		
		HashSet<Point> secondRectanglePoints = findAllPointsOfRectangle(secondXcord, secondYcord, secondWidth, secondHeight);
		
		for(Point p : secondRectanglePoints){
			if(firstRectanglePoints.contains(p)){
				result = true;
			}
		}
		
		return result;
	}

	public static HashSet<Point> findAllPointsOfRectangle(int xCord, int yCord, int width, int height){
		HashSet<Point> result = new HashSet<Point>();
		
		result.add(new Point(xCord, yCord)); // lower left point
		result.add(new Point(xCord, yCord+height)); // upper left point
		result.add(new Point(xCord+width, yCord+height)); // upper right point
		result.add(new Point(xCord+width, yCord)); // lower right point
		
		return result;
	}
	
}

class Point{
	public int xcod;
	public int ycod;
	
	public Point(int x, int y){
		xcod = x;
		ycod = y;
	}
	
	@Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Point point = (Point) o;
        
        if (xcod != point.xcod)
            return false;
        if (ycod != point.ycod)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int xcodHashCode = new Integer(xcod).hashCode();
        int ycodHashCode = new Integer(xcod).hashCode();
        
        return xcodHashCode + ycodHashCode;
    }

    @Override public String toString()
    {
        String result = "POINT{" +
                "x='" + xcod + '\'' +
                ", y='" + ycod + "}";
        return result;
    }
}