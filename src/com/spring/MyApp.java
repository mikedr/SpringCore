package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		CitroenCar aCar = context.getBean("citroenCar", CitroenCar.class);
		System.out.println(aCar.getBrand());
		System.out.println(aCar.getModel());
		context.close();
	}

}
