package com.spring;

public class CitroenCar implements Car{
	
	private EngineService engineService;
	
	public CitroenCar(EngineService engineService) {
		this.engineService = engineService;
	}
	
	@Override
	public String getAcarRide() {
		return "Driving a Citroën car";
	}

	@Override
	public String getEngine() {
		return engineService.provideEngine();
	}
	
}
