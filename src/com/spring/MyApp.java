package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		Car aCar = context.getBean("myCar", Car.class);
		System.out.println("Memory location of the first retrieved car: "+aCar);
		context.close();
	}

}
