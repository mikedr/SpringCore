package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarsConfig.class);
		BMWCar theCar = context.getBean("bMWCar",BMWCar.class);
		System.out.println(theCar.getBrand()+" "+theCar.getColor());
		System.out.println(theCar.getAcarRide());
		System.out.println(theCar.getEngine());
		context.close();
	}

}
