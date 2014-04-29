package com.gapmeister.src;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class ExitState extends BasicGameState {
	
	//State used exclusively for exiting the game. Put all your multiplayer/filesystem cleanup code in here.

	public void init(GameContainer window, StateBasedGame game) throws SlickException {
		
	}

	public void render(GameContainer window, StateBasedGame game, Graphics g) throws SlickException {
		
	}

	public void update(GameContainer window, StateBasedGame game, int delta) throws SlickException {
		System.exit(0);
	}

	public int getID() {
		return -1;
	}

}
