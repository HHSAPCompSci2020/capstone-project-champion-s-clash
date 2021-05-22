package characters;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Champion;

public class Warrior extends Champion{

	public Warrior(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Asset.warriorStand, (int)x, (int)y, null);
		
	}

}
