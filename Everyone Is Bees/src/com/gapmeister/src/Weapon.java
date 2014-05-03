package com.gapmeister.src;

public class Weapon
{
	private final float BOOLET_SPEED = 10;
	
	private GameState porQue;
	
	public Weapon(GameState g)
	{
		porQue = g;
	}
	
	public void fire(MovementVector playerPos, MovementVector cursorPos)
	{
		float deltaX = playerPos.x - cursorPos.x;
		float deltaY = playerPos.y - cursorPos.y;
		float length = (float)(Math.sqrt(Math.pow(deltaX, 2)+Math.pow(deltaY, 2)));
		
		porQue.addEntity(new Boolet(playerPos.x, playerPos.y, new MovementVector(BOOLET_SPEED*(deltaX/length), BOOLET_SPEED*(deltaY/length)), new MovementUnit(), porQue, null, 800, length));
		
		//booletSpeed = new MovementVector(BOOLET_SPEED*(deltaX/length), BOOLET_SPEED*(deltaY/length));
		//booletX = playerPos.x;
		//booletY = playerPos.y;
	}

}