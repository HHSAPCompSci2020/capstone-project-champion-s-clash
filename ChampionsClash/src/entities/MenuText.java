package entities;

import java.awt.Graphics;

import championClash.Asset;

public class MenuText extends Entity{

	public MenuText(float x, float y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Asset.menuText, (int)x, (int)y, width, height, null);
		
	}

}
