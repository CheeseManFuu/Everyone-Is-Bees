package com.gapmeister.src;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class TitleState extends BasicGameState {

	private int milliCount = 0;
	private int frameCount = 0;
	
	private String fullTitle = "Everyone     Is     Bees";
	private String displayedTitle = "";
	private final int FRAMES_PER_LETTER = 15;
	
	public void init(GameContainer window, StateBasedGame game) throws SlickException {//Called before the game runs

	}

	public void enter(GameContainer window, StateBasedGame game) {//Called upon entering this state
		window.setShowFPS(false);
		window.setVSync(true);
	}

	public void render(GameContainer window, StateBasedGame game, Graphics g) throws SlickException {//Render loop
		g.drawString(displayedTitle, 100, 100);
		/*g.drawString("Everyone", 100, 100);
		if(milliCount >= 3000) {
			g.drawString("Is", 200, 100);
		}
		if(milliCount >= 6000) {
			g.drawString("Bees", 240, 100);
		}*/
	}

	public void update(GameContainer window, StateBasedGame game, int delta) throws SlickException {//Game logic loop
		for(milliCount += delta; milliCount > 16; milliCount-= 16)
		{
			frameCount ++;
			displayedTitle = fullTitle.substring(0, Math.min(fullTitle.length(), frameCount/FRAMES_PER_LETTER));
			
			//Waiting until the title has been drawn out, plus a bit of extra time.
			if(frameCount >= FRAMES_PER_LETTER*(fullTitle.length()+10))
			{
				game.enterState(1);
			}
		}
		/*
		if(milliCount >= 10000) {
			game.enterState(1);
		}*/
	}

	public void exit(GameContainer window, StateBasedGame game) {//Called before exiting this state
		
	}

	public int getID() {//Unique to each state. Used in the StateBasedGame.enterState(int) method.
		return 0;
	}

}
