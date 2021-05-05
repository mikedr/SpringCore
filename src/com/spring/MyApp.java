package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		Car aCar = context.getBean("theMechi", Car.class);
		System.out.println(aCar.getAcarRide());
		context.close();
	}

}
