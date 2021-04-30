package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car aCar = context.getBean("myNewCar", Car.class);
		System.out.println(aCar.getAcarRide());
		System.out.println(aCar.getEngine());
		context.close();
	}

}
