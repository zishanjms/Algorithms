package org.zishan.java.initializingCollections;

import java.util.List;

public class Triangle {
	
	private List<Point> pointList;
	
	public List<Point> getPointList() {
		return pointList;
	}

	public void setPointList(List<Point> pointList) {
		this.pointList = pointList;
	}

	public void draw(){
		
		for(Point point : pointList)
		{
			System.out.println(point.toString());
		}
	}
	
}
