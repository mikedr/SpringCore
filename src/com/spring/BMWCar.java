package com.spring;

import org.springframework.beans.factory.annotation.Value;

public class BMWCar implements Car{
	
	@Value("${car.brand}")
	private String brand;
	
	@Value("${car.color}")
	private String color;
	
	private EngineService engineService;
	
	public BMWCar(EngineService engineService) {
		this.engineService = engineService;
	}

	@Override
	public String getAcarRide() {
		return "Driving a BMW";
	}

	@Override
	public String getEngine() {
		return engineService.provideEngine();
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}
	

}
