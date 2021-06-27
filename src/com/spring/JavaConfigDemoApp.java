package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarsConfig.class);
		Car theCar = context.getBean("bMWCar",Car.class);
		System.out.println(theCar.getAcarRide());
		System.out.println(theCar.getEngine());
		context.close();
	}

}
