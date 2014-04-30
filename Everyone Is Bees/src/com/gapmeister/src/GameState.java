package com.gapmeister.src;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState {
	
	private MovementUnit ground;
	private boolean up, down, left, right;
	private MovementVector playerMovement;
	
	public void init(GameContainer window, StateBasedGame game) throws SlickException {//Called before the game runs
		ground = new MovementUnit();
	}

	public void enter(GameContainer window, StateBasedGame game) {//Called upon entering this state
		window.setShowFPS(true);
		window.setVSync(true);
	}

	public void render(GameContainer window, StateBasedGame game, Graphics g) throws SlickException {//Render loop
		ground.draw(g);
	}

	public void update(GameContainer window, StateBasedGame game, int delta) throws SlickException {//Game logic loop
		if(!up && !down && !left && !right) {
			playerMovement = new MovementVector();
		} else {
			playerMovement = new MovementVector((left?-1:0) + (right?1:0), (up?-1:0) + (down?1:0));
		}
		ground.update(playerMovement);
	}
	
	public void keyPressed(int code, char key) {
		switch(key) {
		case 'a': left = true;
			break;
		case 's': down = true;
			break;
		case 'd': right = true;
			break;
		case 'w': up = true;
			break;
		}
	}
	
	public void keyReleased(int code, char key) {
		switch(key) {
		case 'a': left = false;
			break;
		case 's': down = false;
			break;
		case 'd': right = false;
			break;
		case 'w': up = false;
			break;
		}
	}
	
	public void exit(GameContainer window, StateBasedGame game) {//Called before exiting this state
		
	}

	public int getID() {//Unique to each state. Used in the StateBasedGame.enterState(int) method.
		return 2;
	}

}
