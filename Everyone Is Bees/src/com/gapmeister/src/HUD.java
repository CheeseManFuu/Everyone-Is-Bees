package com.gapmeister.src;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;

public class HUD {
	
	private Player player;
	private int hp, mp;
	private Color mpBlue;
	
	public HUD(Player p) {
		player = p;
		mpBlue = new Color(40, 162, 255);
	}
	
	public void update() {
		hp = player.getHealth();
		mp = player.getMana();
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.drawRect(0, 0, 800, 50);
		g.setColor(Color.white);
		g.drawString("HP: "+hp, 700, 5);
		g.setColor(mpBlue);
		g.drawString("MP: "+mp, 700, 25);
	}
	
}
