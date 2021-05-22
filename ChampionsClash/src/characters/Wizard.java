package characters;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Champion;

public class Wizard extends Champion{

	public Wizard(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Asset.wizardStand, (int)x, (int)y, null);
		
	}

}
