package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

public class MovementUnit {
	
	private Rectangle getRect;
	
	public MovementUnit() {
		getRect = new Rectangle(100, 100, 500, 200);
	}
	
	public void update() {
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.draw(getRect);
		g.fillRect(getRect.getX(), getRect.getY(), getRect.getMaxX(), getRect.getMaxY());
	}
	
	public float[] getCenter() {
		float[] tmp = new float[2];
		tmp[0] = getRect.getMaxX()/2 + getRect.getMinX();
		tmp[1] = getRect.getMaxY()/2 + getRect.getMinY();
		return tmp;
	}
	
}
