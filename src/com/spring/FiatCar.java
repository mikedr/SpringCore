package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FiatCar implements Car {

	@Override
	public String getAcarRide() {
		return "Driving a Fiat";
	}

	public void doMyStartupSuff() {
		System.out.println("Fiat: inside startup");
	}
	
	public void doMyDestroySuff() {
		System.out.println("Fiat: inside destroy");
	}

	@Override
	public String getEngine() {
		return null;
	}
}
