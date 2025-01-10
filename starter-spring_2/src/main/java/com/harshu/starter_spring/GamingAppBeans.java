package com.harshu.starter_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harshu.starter_spring.game.Gamerunner;


@Configuration
@ComponentScan("com.harshu.starter_spring.game")
public class GamingAppBeans {
	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(GamingAppBeans.class)){
		context.getBean(Gamerunner.class).run();
		}
	}
	
}
