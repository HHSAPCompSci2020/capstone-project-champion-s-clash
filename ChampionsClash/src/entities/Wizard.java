package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import championClash.Asset;
import championClash.Game;
import championClash.Rectangle;

public class Wizard extends Champion{
	
	private Game game;
	Rectangle fireBall;
	int fireBallX;
	int fireBallY;
	boolean direction;

	public Wizard(Game game, float x, float y, BufferedImage image) {
		super(x, y, Champion.DEFAULT_CHAMPION_WIDTH, Champion.DEFAULT_CHAMPION_HEIGHT, image);
		this.game = game;
		speed = 5;
		fireBallX = -100;
		fireBallY = -100;
		fireBall = new Rectangle(fireBallX, fireBallY, 30, 30);
		bounds.x= 15;
		bounds.y = 32;
		bounds.width = 32;
		bounds.height = 68;
		direction = true;
	}

	@Override
	public void tick() {
		getInput();
		move();
		
		fireBall = new Rectangle(fireBallX, fireBallY, 30, 30);

		if(direction)
			fireBallX+=7;
		if(!direction)
			fireBallX-=7;
		
		yMove = (float) (yMove * gravity + 0.65);
	}
	
	
	private void getInput(){
		xMove = 0;
		
			if(game.getKeyManager().left==true) {
				changeImage(Asset.wizardMove);
				xMove-=speed;
			}
			
			if(game.getKeyManager().right==true) {
				changeImage(Asset.wizardMove);
				xMove+=speed;
			}
			
			if(game.getKeyManager().jump==true) {
				changeImage(Asset.wizardStand);
				accelerate(0, -5);
			}
			if(game.getKeyManager().attack==true) {
				changeImage(Asset.wizardAttack);
				fireBallX = (int) x + width;
				fireBallY = (int) y + height / 2;
				if(xMove > 0)
					direction = true;
				else if(xMove < 0)
					direction = false;
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
	
	public BufferedImage getImage() {
		return Asset.wizardStand;
	}


	@Override
	public void draw(Graphics g) {
		g.drawImage(champImage, (int) x, (int) y, width, height, null);
		g.setColor(Color.orange);
		g.fillRect((int) fireBall.x, (int) fireBall.y, 30, 30);
//		g.fillRect((int)x+bounds.x, (int)y+bounds.y, bounds.width, bounds.height);
	}

}
