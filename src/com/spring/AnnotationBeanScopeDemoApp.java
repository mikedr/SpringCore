package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Car theCar = context.getBean("myCar",Car.class);
		Car otherCar = context.getBean("myCar",Car.class);
		boolean result = theCar == otherCar;
		System.out.println("Memory location myCar: "+theCar);
		System.out.println("Memory location otherCar: "+otherCar);
		System.out.println("Are pointing to the same object?: "+result);
		context.close();
	}

}
