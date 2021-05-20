package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ToyotaCar implements Car{

	@Autowired
	private EngineService engineService;
	
	public ToyotaCar () {

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
