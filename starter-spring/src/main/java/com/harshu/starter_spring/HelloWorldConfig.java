package com.harshu.starter_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
record Person(String name,int age) {};
record Adress(String firstLine,String city) {};
@Configuration
public class HelloWorldConfig {
	@Bean
	public String name(){
		return "Harshith";
	}
	@Bean
	public int age() {
		return 15;
	}
	@Bean
	public Person person(String name,int age) {
		var person=new Person(name,age);
		return person;
	}
	@Bean
	public Adress address(String firstLine,String city) {
		var address=new Adress("Bannerghatta","Bangalore");
		return address;
	}
}
