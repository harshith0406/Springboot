package com.harshu.starter_spring.game;
import org.springframework.stereotype.Component;

@Component

public class Mario implements GamingConsole {

	public void up() {
		// TODO Auto-generated method stub
		System.out.println("Moving up");
	}

	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Moving down");		
	}

	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Moving fast");
	}
	
}
