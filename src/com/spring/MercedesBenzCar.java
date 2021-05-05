package com.spring;

import org.springframework.stereotype.Component;

@Component
public class MercedesBenzCar implements Car {

	public MercedesBenzCar() {

	}

	@Override
	public String getEngine() {
		return null;
	}

	@Override
	public String getAcarRide() {
		return "Driving my fancy Mercedes";
	}

}
