package entities;

import java.awt.Graphics;
import java.awt.Rectangle;

import championClash.Game;
/**
 * Any character or tree, bush, or sky on the screen in any state.
 * @author Ethan Bar, Abhishek Garud - 5/24/21
 *
 */
public abstract class Entity {
	
	protected float x, y;
	protected int width, height;
	protected Rectangle bounds;
	
	public Entity(Game game, float x, float y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		bounds = new Rectangle(0,0,width, height);
	}
	
	public Entity(Game game) {
		
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public abstract void tick();
	public abstract void draw(Graphics g);

}
