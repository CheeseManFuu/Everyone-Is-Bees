package com.gapmeister.src;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState {
	
	private MovementUnit ground;
	private boolean up, down, left, right, stopped;
	private MovementVector playerMovement, mousePointer;
	private Player p1;
	private Weapon gun; //This should probably be moved later in development.
	private HUD hud;
	private GameContainer container;
	
	public void init(GameContainer window, StateBasedGame game) throws SlickException {//Called before the game runs
		ground = new MovementUnit();
		mousePointer = new MovementVector();
		p1 = new Player(ground.getCenter()[0], ground.getCenter()[1]);
		gun = new Weapon();
		hud = new HUD(p1);
		container = window;
	}

	public void enter(GameContainer window, StateBasedGame game) {//Called upon entering this state
		window.setShowFPS(true);
		window.setVSync(true);
		window.setMouseGrabbed(true);
	}

	public void render(GameContainer window, StateBasedGame game, Graphics g) throws SlickException {//Render loop
		ground.draw(g);
		gun.draw(g);
		p1.draw(g);
		g.setColor(Color.red);
		g.draw(new Circle(mousePointer.x, mousePointer.y, 5));
		hud.draw(g);
		if(stopped)
		{
			/*
		//WHY IS NOT RENDER
		//I DO NOT UNDERSTAND
			Color overlay = Color.black;
			overlay.a = 0.8f;
			g.setColor(overlay);
			g.draw(new Rectangle(0, 0, 800, 600));*/
			
			g.setColor(Color.black);
			g.fill(new Rectangle(window.getWidth()/2-35, window.getHeight()/2-10, 70, 20));
			g.setColor(Color.white);
			g.drawString("PAUSED", window.getWidth()/2-9*3, window.getHeight()/2-8);
		}
	}

	public void update(GameContainer window, StateBasedGame game, int delta) throws SlickException {//Game logic loop
		if(!stopped)
		{
			mousePointer = new MovementVector(window.getInput().getMouseX(), window.getInput().getMouseY());
			playerMovement = new MovementVector((left?-1:0) + (right?1:0), (up?-1:0) + (down?1:0));
			ground.update();
			gun.update();
			p1.moveNext(playerMovement);
			p1.update();
			hud.update();
		}
	}
	
	public void keyPressed(int code, char key) {
		switch(key) {
		case 'a': left = true;
			break;
		case 's': down = true;
			break;
		case 'd': right = true;
			break;
		case 'w': up = true;
			break;
		}
		if(code == Input.KEY_ESCAPE) {
			container.setMouseGrabbed(stopped);
			stopped = !stopped;
		}
	}
	
	public void keyReleased(int code, char key) {
		switch(key) {
		case 'a': left = false;
			break;
		case 's': down = false;
			break;
		case 'd': right = false;
			break;
		case 'w': up = false;
			break;
		}
	}
	
	public void mouseReleased(int b, int x, int y)
	{
		gun.fire(p1.getPos(), mousePointer);
	}
	
	public void exit(GameContainer window, StateBasedGame game) {//Called before exiting this state
		
	}

	public int getID() {//Unique to each state. Used in the StateBasedGame.enterState(int) method.
		return 2;
	}

}
