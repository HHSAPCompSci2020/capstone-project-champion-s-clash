package ui;


import java.awt.Graphics;
import java.awt.event.MouseEvent;

import championClash.Rectangle;

/**
 * Checks interactivity with UI Objects and mouse.
 * @author Ethan Bar, Abhishek Garud - 5/24/21
 *
 */
public abstract class UIObject {
	
	protected float x, y;
	protected int width, height;
	protected Rectangle bounds;
	protected boolean hovering = false;
	

	public UIObject(float x, float y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		bounds = new Rectangle((int)x, (int)y, width, height);
	}
	
	public abstract void tick();
	
	public abstract void draw(Graphics g);
	
	public abstract void onClick();
	
	public void onMouseMove(MouseEvent e) {
		if(((bounds.x) < e.getX() && e.getX() < (bounds.x+bounds.width)) && ((bounds.y) < e.getY() && e.getY() < (bounds.y+bounds.height))) {
			hovering = true;
		}
		else {
			hovering = false;
		}
	}
	
	public void onMouseRelease(MouseEvent e) {
		if(hovering) {
			onClick();
		}
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

	public boolean isHovering() {
		return hovering;
	}

	public void setHovering(boolean hovering) {
		this.hovering = hovering;
	}

}
