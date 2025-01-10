package com.harshu.starter_spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloworldSpring {

	public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		System.out.println(context.getBean("name"));
	}
}
