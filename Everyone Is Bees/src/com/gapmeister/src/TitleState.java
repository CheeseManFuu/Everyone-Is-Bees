package com.gapmeister.src;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class TitleState extends BasicGameState {

	private int frameCount = 0;
	
	public void init(GameContainer window, StateBasedGame game) throws SlickException {//Called before the game runs

	}

	public void enter(GameContainer window, StateBasedGame game) {//Called upon entering this state
		window.setShowFPS(false);
	}

	public void render(GameContainer window, StateBasedGame game, Graphics g) throws SlickException {//Render loop
		g.drawString("Everyone", 100, 100);
		if(frameCount >= 60) {
			g.drawString("Is", 200, 100);
		}
		if(frameCount >= 120) {
			g.drawString("Bees", 240, 100);
		}
	}

	public void update(GameContainer window, StateBasedGame game, int delta) throws SlickException {//Game logic loop
		frameCount++;
		if(frameCount >= 350) {
			game.enterState(1);
		}
	}

	public void exit(GameContainer window, StateBasedGame game) {//Called before exiting this state

	}

	public int getID() {//Unique to each state. Used in the StateBasedGame.enterState(int) method.
		return 0;
	}

}
