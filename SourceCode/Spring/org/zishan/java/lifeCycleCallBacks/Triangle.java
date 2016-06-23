package org.zishan.java.lifeCycleCallBacks;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw(){

		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean method call for Triangle");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean method call for Triangle");
	}
		
	public void myInit(){
		System.out.println("myInit method call for Triangle");
	}
	
	public void myDestroy(){
		System.out.println("myDestroy method call for Triangle");
	}
}
