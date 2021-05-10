package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MazdaCar implements Car{

	private EngineService engineService;
	
	@Autowired
	public MazdaCar (EngineService engineService) {
		this.engineService = engineService;
	}
	
	@Override
	public String getAcarRide() {
		return "Going in a Mazda";
	}

	@Override
	public String getEngine() {
		return engineService.provideEngine();
	}

}
