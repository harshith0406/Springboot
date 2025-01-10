package com.harshu.starter_spring.game;

public class Gamerunner {
	/*
	 here when we pass the another game to the Gamerunner since its tightly coupled to the mario class it wont work unless we change the name of mario to the Pokemon*/
	Mario mario;
	Pokemon p;
	public Gamerunner(Pokemon p) {
		// TODO Auto-generated constructor stub
		this.p=p;
	}

	public void run() {
		p.up();
		p.down();
		p.accelerate();
	}
}
