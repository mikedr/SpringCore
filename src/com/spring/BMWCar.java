package com.spring;

public class BMWCar implements Car{
	
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

}
