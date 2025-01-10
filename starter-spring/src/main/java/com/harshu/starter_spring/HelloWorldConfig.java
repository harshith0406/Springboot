package com.harshu.starter_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
record Person(String name,int age) {};
record Adress(String firstLine,String city) {};
record Temp(String firstLine,int age) {};
//to prove the ambuiguity
record Exception(String name,int age) {};
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
	//how to use the existing beans in the new bean
	//method 1 passing it as parameters
	@Bean
	public Person person(String name,int age) {
		var person=new Person(name,age);
		return person;
	}
	//to use custom bean names in java
	@Bean(name="adressline")
	public Adress adress(String firstLine,String city) {
		var address=new Adress("Bannerghatta","Bangalore");
		return address;
	}
	//method 2 calling it in function
		@Bean
		public Temp Aname() {
		   return new Temp(name(),age());
		}
	@Bean
	public Person person1(String name,int age) {
			var person=new Person(name,age);
			return person;
	}	
	@Bean
	@Primary
	public Exception ex(String name,int age) {
		return new Exception(name,age);
	}
	@Bean
	public Exception ex() {
		return new Exception(name(),age());
	}
		//if we have same bean name
}
