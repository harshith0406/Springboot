package com.harshu.starter_spring;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harshu.starter_spring.game.Gamerunner;
import com.harshu.starter_spring.game.GamingConsole;
import com.harshu.starter_spring.game.Mario;
import com.harshu.starter_spring.game.Pacman;
import com.harshu.starter_spring.game.Pokemon;

public class GamingAppBeans {

	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(GameConfiguration.class)){
//			
		//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		context.getBean(Gamerunner.class).run();
		}
	}
	
}
