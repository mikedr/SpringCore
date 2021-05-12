package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MazdaCar implements Car{

	private EngineService engineService;
	
	public MazdaCar () {

	}
	
	@Override
	public String getAcarRide() {
		return "Going in a Mazda";
	}

	@Override
	public String getEngine() {
		return engineService.provideEngine();
	}

	@Autowired
	public void setEngineService(EngineService engineService) {
		this.engineService = engineService;
	}
}
