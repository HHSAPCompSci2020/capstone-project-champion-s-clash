package ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import input.ClickListener;

/**
 * Basic button class for menu
 * @author Ethan Bar, Abhishek Garud - 5/24/21
 *
 */
public class UIImageButton extends UIObject{
	
	private BufferedImage button1, button2;
	private ClickListener clicker;

	public UIImageButton(float x, float y, int width, int height, BufferedImage button1, BufferedImage button2, ClickListener clicker) {
		super(x, y, width, height);
		this.button1=button1;
		this.button2=button2;
		this.clicker=clicker;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Determines what start button looks like depending on if mouse is hovering on it.
	 */
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		if(hovering) {
			g.drawImage(button2, (int)x, (int)y, width, height, null);
		}
		else {
			g.drawImage(button1, (int)x, (int)y, width, height, null);
		}
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		clicker.onClick();
	}

}
