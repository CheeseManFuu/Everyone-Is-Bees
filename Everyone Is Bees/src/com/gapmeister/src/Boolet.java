package com.gapmeister.src;

import org.newdawn.slick.Graphics;

public class Boolet extends Entity {

	private float range;
	private Entity parent;
	private float speed;
	
	public Boolet(float x, float y, MovementVector v, MovementUnit u, GameState g, Entity p, float r, float s) {
		super(x, y, v, u, g);
		parent = p;
		range = r;
		speed = s;
	}

	public void update() {
		x += momentum.x * speed;
		y += momentum.y * speed;
		if(range <= 0) {
			range -= momentum.getDist();
		} else {
			kill(this);
		}
	}

	public void draw(Graphics g) {
		
	}
	
	public Entity getParent() {
		return parent;
	}

}
