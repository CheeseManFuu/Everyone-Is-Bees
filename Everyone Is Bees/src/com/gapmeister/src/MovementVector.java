package com.gapmeister.src;

public class MovementVector {
	
	public final float x, y;
	
	public MovementVector() {
		this(0, 0);
	}
	
	public MovementVector(float dX, float dY) {
		//This should probably only be 1, 0, or -1. We should let the entity's movement speed handle most of that.
		x = dX;
		y = dY;
	}
	
	public float getDist() {
		return (float)Math.sqrt(Math.pow(x, 2) * Math.pow(y, 2));
	}
	
}
