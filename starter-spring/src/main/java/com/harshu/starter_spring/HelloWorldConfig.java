package com.harshu.starter_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	@Bean
	public String name(){
		return "Harshith";
	}
	
}
