package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

public class MovementUnit {
	
	private Player player1;
	
	private Rectangle getRect;
	
	public MovementUnit() {
		getRect = new Rectangle(100, 100, 500, 200);
		player1 = new Player(getRect.getCenterX(), getRect.getCenterY());
	}
	
	public void update(MovementVector v) {
		player1.moveNext(v);
		player1.update();
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.draw(getRect);
		g.fillRect(getRect.getX(), getRect.getY(), getRect.getMaxX(), getRect.getMaxY());
		player1.draw(g);
	}
	
}
