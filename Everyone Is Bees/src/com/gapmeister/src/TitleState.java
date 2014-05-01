package com.gapmeister.src;

import java.util.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class TitleState extends BasicGameState {

	private int milliCount = 0;
	private int frameCount = 0;
	private final int MAX_FRAMES_PER_SECOND = 60;
	
	private ArrayList<String> fullTitle;
	private String displayedTitle = "";
	private final int FRAMES_PER_LETTER = 7;
	
	public void init(GameContainer window, StateBasedGame game) throws SlickException {//Called before the game runs
		fullTitle = new ArrayList<String>();
		fullTitle.add("Team 1AM_BRILLIANCE Presents...");
		fullTitle.add("The Best ARPG Since Daikatana...");
		fullTitle.add("EVERYONE");
		fullTitle.add("IS");
		fullTitle.add("BEES");
	}

	public void enter(GameContainer window, StateBasedGame game) {//Called upon entering this state
		window.setShowFPS(false);
		window.setVSync(true);
	}

	public void render(GameContainer window, StateBasedGame game, Graphics g) throws SlickException {//Render loop
		g.drawString(displayedTitle, window.getWidth()/2-9*displayedTitle.length()/2, window.getHeight()/2-6);
	}

	public void update(GameContainer window, StateBasedGame game, int delta) throws SlickException {//Game logic loop
		for(milliCount += delta; milliCount >= 1000/MAX_FRAMES_PER_SECOND; milliCount-= 1000/MAX_FRAMES_PER_SECOND)
		{
			if(!fullTitle.isEmpty())
			{
				frameCount ++;
				displayedTitle = fullTitle.get(0).substring(0, Math.min(fullTitle.get(0).length(), frameCount/FRAMES_PER_LETTER));
			
				//Waiting until the title has been drawn out, plus a bit of extra time.
				if(frameCount >= FRAMES_PER_LETTER*(fullTitle.get(0).length()+15))
				{
					fullTitle.remove(0);
					frameCount = 0;
				}
			}
			else
			{
				game.enterState(1);
			}
		}
	}
	
	public void keyPressed(int code, char key) {
		while(!fullTitle.isEmpty())
		{
			fullTitle.remove(0);
		}
	}

	public void exit(GameContainer window, StateBasedGame game) {//Called before exiting this state
		
	}

	public int getID() {//Unique to each state. Used in the StateBasedGame.enterState(int) method.
		return 0;
	}

}
