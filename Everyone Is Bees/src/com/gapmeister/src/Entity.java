package com.gapmeister.src;

import org.newdawn.slick.Graphics;

public abstract class Entity {
	
	public Entity(float x, float y, MovementVector v, MovementUnit u) {
		
	}
	
	public abstract void update();
	
	public abstract void draw(Graphics g);
	
}
