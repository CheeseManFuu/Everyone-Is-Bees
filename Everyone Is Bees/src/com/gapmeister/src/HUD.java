package com.gapmeister.src;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;

public class HUD {
	
	private Player player;
	private int hp;
	
	public HUD(Player p) {
		player = p;
	}
	
	public void update() {
		hp = player.getHealth();
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.drawRect(0, 0, 800, 50);
		g.setColor(Color.white);
		g.drawString("HP: "+hp, 700, 25);
	}
	
}
