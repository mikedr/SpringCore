package com.spring;

public class FordCar implements Car {

	private EngineService engineService;
	
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

}
