package com.harshu.starter_spring.game;

public class Gamerunner {
	Mario mario;
	public Gamerunner(Mario mario) {
		// TODO Auto-generated constructor stub
		this.mario=mario;
	}

	public void run() {
		mario.up();
		mario.down();
		mario.accelerate();
	}
}
