package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarsConfig.class);
		Car theCar = context.getBean("fiatCar",Car.class);
		System.out.println(theCar.getAcarRide());
		context.close();
	}

}
