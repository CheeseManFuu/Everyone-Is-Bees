package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public abstract class MenuButton {
	
	private String text;
	private Color color;
	private float x, y, width, height;
	private Rectangle getRect;
	protected StateBasedGame game;
	
	public MenuButton(String s, float x, float y, StateBasedGame game) {
		this(s, Color.black, x, y, game);
	}
	
	public MenuButton(String s, Color c, float x, float y, StateBasedGame game) {
		this(s, c, x, y, 100, 150, game);
	}
	
	public MenuButton(String s, Color c, float x, float y, float width, float height, StateBasedGame game) {
		text = s;
		color = c;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		getRect = new Rectangle(x, y, width, height);
		this.game = game;
	}
	
	public void draw(Graphics g) {
		g.draw(getRect);
		g.setColor(color);
		g.fillRect(x, y, width, height);
		g.setColor((color == Color.black ? Color.white : Color.black));//This line is bad and you should feel bad.
		g.drawString(text, (getRect.getCenterX() - g.getFont().getWidth(text)/2), (getRect.getCenterY() - g.getFont().getHeight(text)/2));
	}
	
	public boolean containsPoint(float x, float y) {
		return getRect.contains(x, y);
	}
	
	public abstract void buttonPressed();
	
	public abstract void buttonReleased();
	
	public abstract void buttonClicked();
	
}
