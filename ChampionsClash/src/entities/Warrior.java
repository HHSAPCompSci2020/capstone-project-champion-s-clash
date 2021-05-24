package entities;

import java.awt.Color;
import java.awt.Graphics;

import championClash.Asset;
import championClash.Game;

public class Warrior extends Champion{
	
	private Game game;
	
	public Warrior(Game game, float x, float y) {
		super(x, y, Champion.DEFAULT_CHAMPION_WIDTH, Champion.DEFAULT_CHAMPION_HEIGHT);
		this.game = game;
		speed = 4;
		yMove = 0;
		bounds.x= 15;
		bounds.y = 32;
		bounds.width = 32;
		bounds.height = 68;
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
		g.drawImage(Asset.warriorStand, (int) x, (int) y, width, height, null);
		g.setColor(Color.red);
		//g.fillRect((int)x+bounds.x, (int)y+bounds.y, bounds.width, bounds.height);
	}
	

}


