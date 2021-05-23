package characters;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Champion;
import championClash.Game;

public class Wizard extends Champion{
	
	private Game game;

	public Wizard(Game game, float x, float y) {
		super(x, y, Champion.DEFAULT_CHAMPION_WIDTH, Champion.DEFAULT_CHAMPION_HEIGHT);
		this.game = game;
		speed = 5;
	}

	@Override
	public void tick() {
		getInput();
		move();
		
		yMove = (float) (yMove * gravity + 0.65);
	}
	
	
	private void getInput(){
		xMove = 0;
		
			if(game.getKeyManager().left==true) {
				xMove-=speed;
			}
			
			if(game.getKeyManager().right==true) {
				xMove+=speed;
			}
			
			if(game.getKeyManager().jump==true) {
				accelerate(0, -5);
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
		g.drawImage(Asset.wizardStand, (int) x, (int) y, width, height, null);
	}

}
