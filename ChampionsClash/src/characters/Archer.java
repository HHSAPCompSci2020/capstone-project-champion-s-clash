package characters;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Champion;
import championClash.Game;

public class Archer extends Champion{
	
	private Game game;

	public Archer(Game game, float x, float y) {
		super(x, y);
		this.game=game;
		health = 100;
		speed = 6;
		damage = 3;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		if(game.getKeyManager().up==true) {
			
		}
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Asset.archerStand, (int)x, (int)y, null);
		
	}

}
