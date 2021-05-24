package entities;

import java.awt.Graphics;

import championClash.Asset;

public class Bush extends Entity{

	public Bush(float x, float y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Asset.bush, (int)x, (int)y, width, height, null);
		
	}

}
