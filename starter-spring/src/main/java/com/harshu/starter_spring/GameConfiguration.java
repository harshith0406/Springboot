package com.harshu.starter_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.harshu.starter_spring.game.Gamerunner;
import com.harshu.starter_spring.game.GamingConsole;
import com.harshu.starter_spring.game.Mario;
import com.harshu.starter_spring.game.Pacman;
import com.harshu.starter_spring.game.Pokemon;

@Configuration
public class GameConfiguration {
	
	@Bean
	public GamingConsole game (){
		var game=new Pokemon();
		return game;
	}
	@Bean
	public Gamerunner run (GamingConsole game){
		var run=new Gamerunner(game);
		return run;
	}
	
	
}
