package com.harshu.starter_spring.hello;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloworldSpring {

	public static void main(String[] args) {
		var context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
//		System.out.println(context.getBean("name"));
//		System.out.println(context.getBean("person"));
//		System.out.println(context.getBean("adressline"));
//		//other way of retrival
//		System.out.println(context.getBean(Adress.class));
//		System.out.println(context.getBean("Aname"));
//		//retrieve all beans managed by the spring
Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		//System.out.println(context.getBean(Exception.class));
	}
}
