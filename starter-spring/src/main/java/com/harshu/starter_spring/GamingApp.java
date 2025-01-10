package com.harshu.starter_spring;

import com.harshu.starter_spring.game.Gamerunner;
import com.harshu.starter_spring.game.Mario;
import com.harshu.starter_spring.game.Pokemon;

public class GamingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Concept of loose coupling
		coupling can be defined as the work involved in changing the code
		We must make sure the classes in java are loosely coupled and hence we can easily change as per the requirements
		Suppose we need to add a new game to this its not easy because of the tight coupling in the code and hence we avoid by using the interfaces
		
		*/
		var anotherGame=new Pokemon();
		var mario=new Mario();
		var gameRunner=new Gamerunner(mario);
		gameRunner.run();
	}
	
}
