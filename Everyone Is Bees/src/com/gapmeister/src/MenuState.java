package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MenuState extends BasicGameState {
	
	private StateBasedGame game;
	
	private MenuButton[] buttons;
	
	public void init(GameContainer window, StateBasedGame game) throws SlickException {//Called before the game runs
		buttons = new MenuButton[1];
		buttons[0] = new StartButton("Start", Color.gray, 300, 275, 200, 50, game);
	}

	public void enter(GameContainer window, StateBasedGame game) {//Called upon entering this state
		window.setShowFPS(false);
		this.game = game;
	}
	
	public void render(GameContainer window, StateBasedGame game, Graphics g) throws SlickException {//Render loop
		g.drawString("Everyone Is Bees\n\nMain Menu", 5f, 5f);
		for(MenuButton button: buttons) {
			if(button != null) {
				button.draw(g);
			}
		}
	}

	public void update(GameContainer window, StateBasedGame game, int delta) throws SlickException {//Game logic loop
		
	}
	
	public void mousePressed(int b, int x, int y) {
		for(MenuButton button: buttons) {
			if(button.containsPoint(x, y)) {
				button.buttonPressed();
			}
		}
	}
	
	public void exit(GameContainer window, StateBasedGame game) {//Called before exiting this state
		
	}

	public int getID() {//Unique to each state. Used in the StateBasedGame.enterState(int) method.
		return 1;
	}

}
