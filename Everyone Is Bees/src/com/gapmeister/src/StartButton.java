package com.gapmeister.src;

import org.newdawn.slick.Image;
import org.newdawn.slick.gui.GUIContext;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.state.StateBasedGame;

public class StartButton extends MouseOverArea {

	private StateBasedGame game;
	
	public StartButton(GUIContext container, Image image, int x, int y, StateBasedGame game) { 
		super(container, image, x, y);
		this.game = game;
	}
	
	public void mousePressed(int button, int x, int y) {
		game.enterState(2);
	}
	
}
