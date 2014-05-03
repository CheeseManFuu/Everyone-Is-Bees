package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

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
		if(range >= 0) {
			range -= momentum.getDist();
		} else {
			kill(this);
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		//g.draw(new Rectangle(booletX, booletY, 3, 3));
		g.fill(new Rectangle(x, y, 3, 3));
	}
	
	public Entity getParent() {
		return parent;
	}

}
