package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Circle;

public class Player {
	
	private float x, y;
	private float speed;
	private MovementVector v = new MovementVector();
	
	public Player(float x, float y) {
		this.x = x;
		this.y = y;
		speed = 1.2f;
	}
	
	public MovementVector getPos()
	{
		return new MovementVector(x, y);
	}
	
	public void moveNext(MovementVector v) {
		this.v = v;
	}
	
	public void update() {
		x += v.x * speed;
		y += v.y * speed;
	}
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.draw(new Circle(x, y, 10));
		g.fill(new Circle(x, y, 10));
	}

}
