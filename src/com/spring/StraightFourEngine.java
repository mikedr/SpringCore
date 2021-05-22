package com.spring;

import org.springframework.stereotype.Component;

@Component
public class StraightFourEngine implements EngineService{

	@Override
	public String provideEngine() {
		return "Here you go your Straight-four engine";
	}

}
