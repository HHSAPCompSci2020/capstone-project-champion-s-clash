package characters;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Champion;
import championClash.Game;

public class Archer extends Champion{
	
	private Game game;

	public Archer(Game game, float x, float y) {
		super(x, y, Champion.DEFAULT_CHAMPION_WIDTH-20, Champion.DEFAULT_CHAMPION_HEIGHT);
		this.game = game;
		speed = 6;
	}

	@Override
	public void tick() {
		getInput();
		move();
	}
	
	private void getInput(){
		xMove = 0;
		yMove = 0;
		
			if(game.getKeyManager().left==true) {
				xMove-=speed;
			}
			
			if(game.getKeyManager().right==true) {
				xMove+=speed;
			}
		/*
		
		if(isPlayer1) {
			if(game.getKeyManager().left1==true) {
				xMove-=speed;
			}
			
			if(game.getKeyManager().right1==true) {
				xMove+=speed;
			}
		}
		*/
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Asset.archerStand, (int) x, (int) y, width, height, null);
	}
}
