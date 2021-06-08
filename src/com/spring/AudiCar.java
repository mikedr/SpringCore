package com.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class AudiCar implements Car {

	private EngineService engineService;
	
	public AudiCar(EngineService engineService) {
		super();
		this.engineService = engineService;
	}

	@Override
	public String getAcarRide() {
		return "Driving an Audi";
	}

	@Override
	public String getEngine() {
		return engineService.provideEngine();
	}

	public void doMyStartupSuff() {
		System.out.println("AudiCar: inside startup");
	}
	
	public void doMyDestroySuff() {
		System.out.println("AudiCar: inside destroy");
	}
}
