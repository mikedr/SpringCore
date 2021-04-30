package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		FordCar aCar = context.getBean("myNewestCar", FordCar.class);
		System.out.println(aCar.getAcarRide());
		System.out.println(aCar.getEngine());
		System.out.println(aCar.getBrand());
		System.out.println(aCar.getModel());
		context.close();
	}

}
