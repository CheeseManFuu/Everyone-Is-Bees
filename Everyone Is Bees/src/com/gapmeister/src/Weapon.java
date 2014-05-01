package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;

public class Weapon
{
	private final float BOOLET_SPEED = 10;
	
	private MovementVector booletSpeed;
	private float booletX, booletY;
	
	public Weapon()
	{
		//Initial values for the bullet: immobile and offscreen. Just the way we want them.
		booletSpeed = new MovementVector(0, 0);
		booletX = -20;
		booletY = -20;
	}
	
	public void update()
	{
		booletX -= booletSpeed.x;
		booletY -= booletSpeed.y;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.yellow);
		//g.draw(new Rectangle(booletX, booletY, 3, 3));
		g.fill(new Rectangle(booletX, booletY, 3, 3));
	}
	
	public void fire(MovementVector playerPos, MovementVector cursorPos)
	{
		float deltaX = playerPos.x - cursorPos.x;
		float deltaY = playerPos.y - cursorPos.y;
		float length = (float)(Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2)));
		
		booletSpeed = new MovementVector(BOOLET_SPEED*(deltaX/length), BOOLET_SPEED*(deltaY/length));
		booletX = playerPos.x;
		booletY = playerPos.y;
	}

}