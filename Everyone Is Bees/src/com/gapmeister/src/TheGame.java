package com.gapmeister.src;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.AppGameContainer;

public class TheGame extends StateBasedGame {

	private static AppGameContainer window;
	private static TheGame game;
	
	public static void main(String[] args) throws SlickException {
		game = new TheGame();
		window = new AppGameContainer(game, 800, 600, false);
		game.init(window);
		window.setClearEachFrame(true);
		window.start();
	}
	
	public TheGame() {
		super("Uncle Lucy's Battle Royale ver. 1.048596");
	}
	
	public void initStatesList(GameContainer window) throws SlickException {//Add each state below. First state on the list is the default.
		addState(new MenuState());
		addState(new GameState());
	}
	
}
