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
		window.start();
		window.setClearEachFrame(true);
		game.init(window);
		//If you can see this and the game still works, then I haven't done anything wrong yet. ~Mokey
	}
	
	public TheGame() {
		super("Everyone Is Bees");
	}
	
	public void initStatesList(GameContainer window) throws SlickException {//Add each state below. First state on the list is the default.
		//addState(new TitleState());
		addState(new MenuState());
		addState(new GameState());
		addState(new ExitState());
	}
	
}
