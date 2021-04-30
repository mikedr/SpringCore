package com.spring;

public class FordCar implements Car {

	private EngineService engineService;
	private String brand;
	private String model;
	
	public FordCar() {
	
	}

	public void setEngineService(EngineService engineService) {
		this.engineService = engineService;
	}

	@Override
	public String getAcarRide() {
		return "Going in a Ford";
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
