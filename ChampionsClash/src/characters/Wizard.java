package characters;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Champion;
import championClash.Game;

public class Wizard extends Champion{
	
	private Game game;

	public Wizard(Game game, float x, float y) {
		super(x, y);
		this.game=game;
		health = 100;
		speed = 4;
		damage = 4;
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
