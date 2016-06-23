package org.zishan.java.appContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContextAwareSpring.xml");
		Triangle triangle =(Triangle) context.getBean("triangle");
		triangle.draw();

	}

}
