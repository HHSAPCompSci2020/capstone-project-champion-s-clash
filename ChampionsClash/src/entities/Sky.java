package entities;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Game;

public class Sky extends Entity{

	public Sky(Game game, float x, float y, int width, int height) {
		super(game, x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public Sky(Game game) {
		super(game);
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
