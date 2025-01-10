package com.harshu.starter_spring.game;

import org.springframework.stereotype.Component;

@Component
public class Gamerunner {
	/*
	 here when we pass the another game to the Gamerunner since its tightly coupled to the mario class it wont work unless we change the name of mario to the Pokemon*/
//	Mario mario;
//	Pokemon p;
	GamingConsole console;
	public Gamerunner(GamingConsole console) {
		// TODO Auto-generated constructor stub
		this.console=console;
	}

	public void run() {
		console.up();
		console.down();
		console.accelerate();
	}
}
