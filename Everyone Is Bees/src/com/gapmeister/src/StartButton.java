package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.state.StateBasedGame;

public class StartButton extends MenuButton {
	
	public StartButton(String s, Color c, float x, float y, float width, float height, StateBasedGame game) {
		super(s, c, x, y, width, height, game);
		
	}

	public void buttonPressed() {
		game.enterState(2);
	}

	public void buttonReleased() {
		
	}

	public void buttonClicked() {
		
	}

}
