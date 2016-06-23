package org.zishan.java.appContextAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context=null;
	
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
		
		this.pointA = (Point) context.getBean("pointA");
		this.pointB = (Point) context.getBean("pointB");
		this.pointC = (Point) context.getBean("pointC");
		
		return "Triangle [pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + "]";
	}

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean Name is :" + beanName);
		
	}
	
}
