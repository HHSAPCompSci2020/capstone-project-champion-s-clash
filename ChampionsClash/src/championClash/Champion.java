package championClash;

import java.awt.Graphics;

import characters.Entity;

public abstract class Champion extends Entity{
	
	protected int health, speed, damage;

	public Champion(float x, float y) {
		super(x, y);
		
	}

}
