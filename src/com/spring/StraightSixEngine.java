package com.spring;

import org.springframework.stereotype.Component;

@Component
public class StraightSixEngine implements EngineService{

	@Override
	public String provideEngine() {
		return "Here you go your six cylinder engine";
	}

}
