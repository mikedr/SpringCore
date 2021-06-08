package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Car theCar = context.getBean("fiatCar",Car.class);
		System.out.println(theCar.getAcarRide());
		context.close();
	}

}
