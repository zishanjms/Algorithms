package org.zishan.java.injectingObjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppForInjectingObjects {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("InjectingObjectSpring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
