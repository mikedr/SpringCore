package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Car aCar = context.getBean("myCar", Car.class);
		Car otherCar = context.getBean("myCar", Car.class);
		boolean sameObject = (aCar == otherCar);
		System.out.println("Are both variables pointing to the same object: "+sameObject);
		System.out.println("Memory location of the first retrieved car: "+aCar);
		System.out.println("Memory location of the second retrieved car: "+otherCar);
		context.close();
	}

}
