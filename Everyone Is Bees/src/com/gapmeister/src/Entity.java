package com.gapmeister.src;

import org.newdawn.slick.Graphics;

public abstract class Entity {
	
	protected float x, y;
	protected MovementVector momentum;
	protected MovementUnit ground;
	protected GameState game;
	
	public Entity(float x, float y, MovementVector v, MovementUnit u, GameState g) {
		this.x = x;
		this.y = y;
		momentum = v;
		ground = u;
		game = g;
	}

	public void applyForce(MovementVector v) {
		float a, b;
		a = (float)Math.sqrt(Math.pow(momentum.x, 2) + Math.pow(v.x, 2));
		b = (float)Math.sqrt(Math.pow(momentum.y, 2) + Math.pow(v.y, 2));
		momentum = new MovementVector(a, b);
	}
	
	public abstract void update();
	
	public abstract void draw(Graphics g);
	
	public void kill(Entity murderer) {
		game.removeEntity(this);
	}
	
}
