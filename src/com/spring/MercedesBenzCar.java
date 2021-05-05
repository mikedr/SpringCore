package com.spring;

import org.springframework.stereotype.Component;

@Component("theMechi")
public class MercedesBenzCar implements Car {

	public MercedesBenzCar(EngineService engineService) {

	}

	@Override
	public String getEngine() {
		return null;
	}

	@Override
	public String getAcarRide() {
		return "Driving my fancy Mecedes";
	}

}
