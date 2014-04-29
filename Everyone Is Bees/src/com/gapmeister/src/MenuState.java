package com.gapmeister.src;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MenuState extends BasicGameState {
	
	private StateBasedGame game;
	
	private StartButton start;
	
	public void init(GameContainer window, StateBasedGame game) throws SlickException {//Called before the game runs
		
	}

	public void enter(GameContainer window, StateBasedGame game) {//Called upon entering this state
		window.setShowFPS(false);
		this.game = game;
	}
	
	public void render(GameContainer window, StateBasedGame game, Graphics g) throws SlickException {//Render loop
		g.drawString("Main Menu", 5f, 5f);
	}

	public void update(GameContainer window, StateBasedGame game, int delta) throws SlickException {//Game logic loop
		
	}
	
	public void mousePressed(int button, int x, int y) {
		game.enterState(2);
	}
	
	public void exit(GameContainer window, StateBasedGame game) {//Called before exiting this state
		
	}

	public int getID() {//Unique to each state. Used in the StateBasedGame.enterState(int) method.
		return 1;
	}

}
