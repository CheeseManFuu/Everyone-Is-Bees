package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.state.StateBasedGame;

public class ExitButton extends MenuButton {

	public ExitButton(String s, float x, float y, StateBasedGame game) {
		super(s, x, y, game);
	}

	public ExitButton(String s, Color c, float x, float y, StateBasedGame game) {
		super(s, c, x, y, game);
	}

	public ExitButton(String s, Color c, float x, float y, float width, float height, StateBasedGame game) {
		super(s, c, x, y, width, height, game);
	}

	public void buttonPressed() {
	}

	public void buttonReleased() {
		game.enterState(-1);
	}

	public void buttonClicked() {
		
	}

}
