package org.zishan.java.innerBeanAliasIdRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("innerBeanAliasIdRefSpring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		triangle.draw();
	}

}
