package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CitroenCar implements Car{
	
	private EngineService engineService;
	
	@Value("${car.brand.citroen.c3}")
	private String brand;
	
	@Value("${car.model.citroen.c3}")
	private String model;
	
	public CitroenCar() {

	}
	
	public CitroenCar(EngineService engineService) {
		this.engineService = engineService;
	}
	
	@Override
	public String getAcarRide() {
		return "Driving a Citro?n car";
	}

	@Override
	public String getEngine() {
		return engineService.provideEngine();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
