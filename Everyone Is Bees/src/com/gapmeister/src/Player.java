package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Circle;

public class Player {
	
	private float x, y;
	private float speed;
	private MovementVector v = new MovementVector();
	private int hp, mana;
	
	public Player(float x, float y) {
		this.x = x;
		this.y = y;
		speed = 1.2f;
		hp = 10;
		mana = 50;
	}
	
	public MovementVector getPos()
	{
		return new MovementVector(x, y);
	}
	
	public void moveNext(MovementVector v) {
		this.v = v;
	}
	
	public int getHealth() {
		return hp;
	}
	
	public int getMana() {
		return mana;
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
