package com.spring;

public class MazdaCar implements Car{

	private EngineService engineService;
	
	@Override
	public String getAcarRide() {
		return "Going in a Mazda";
	}

	@Override
	public String getEngine() {
		return engineService.provideEngine();
	}

}
