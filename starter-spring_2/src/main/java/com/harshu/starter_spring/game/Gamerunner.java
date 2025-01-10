package com.harshu.starter_spring.game;
import com.harshu.starter_spring.game.Mario;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gamerunner {
	
	GamingConsole console;
	//way to tell we need mario qualifier
	public Gamerunner(@Qualifier("pacman")  GamingConsole console) {
		// TODO Auto-generated constructor stub
		this.console=console;
	}

	public void run() {
		console.up();
		console.down();
		console.accelerate();
	}
}
