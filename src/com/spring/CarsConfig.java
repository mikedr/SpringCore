package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.spring")
@PropertySource("classpath:cars2.properties")
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
