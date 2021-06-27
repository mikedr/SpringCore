package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring")
public class CarsConfig {
	
	@Bean
	public EngineService inlineEngine() {
		return new InlineEngine();
	}
	
	@Bean
	public Car bMWCar() {
		return new BMWCar(inlineEngine());
	}

}
