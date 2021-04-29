package com.spring;

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

}
