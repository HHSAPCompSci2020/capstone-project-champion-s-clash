package entities;

import java.awt.Graphics;

import championClash.Asset;

public class Sky extends Entity{

	public Sky(float x, float y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Asset.sky, (int)x, (int)y, width, height, null);
		
	}

}
