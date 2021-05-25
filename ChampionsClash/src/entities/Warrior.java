package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import championClash.Asset;
import championClash.Game;
import championClash.Rectangle;

/**
 * Warrior subclass of Champion
 * @author Ethan Bar, Abhishek Garud - 5/24/21
 *
 */
public class Warrior extends Champion{
	
	private Game game;
	Rectangle sword;
	int swordX;
	int swordY;
	boolean direction;
	
	public Warrior(Game game, float x, float y, BufferedImage image) {
		super(game, x, y, Champion.DEFAULT_CHAMPION_WIDTH, Champion.DEFAULT_CHAMPION_HEIGHT, image);
		this.game = game;
		speed = 4;
		swordX = -100;
		swordY = -100;
		sword = new Rectangle(swordX, swordY, 50, 5);
		bounds.x= 15;
		bounds.y = 32;
		bounds.width = 32;
		bounds.height = 68;
		direction = true;
	}
	
	public Warrior(Game game) {
		this(game, 0, 0, Asset.warriorStand);
	}

	@Override
	public void tick() {
		getInput();
		move();

		
		yMove = (float) (yMove * gravity + 0.65);
	}
	
	
	private void getInput(){
		if (isPlayerOne()) {
			xMove = 0;
		
			if(game.getKeyManager().left==true) {
				changeImage(Asset.warriorMoveLeft);
				xMove-=speed;
			}
			
			if(game.getKeyManager().right==true) {
				changeImage(Asset.warriorMoveRight);
				xMove+=speed;
			}
			
			if(game.getKeyManager().jump==true) {
				changeImage(Asset.warriorStand);
				accelerate(0, -2);
			}
			if(game.getKeyManager().attack==true && direction) {
				changeImage(Asset.warriorAttackRight);
				swordX = (int) x + width - 30;
				swordY = (int) y + height / 2 + 12;
				sword = new Rectangle(swordX, swordY, 30, 30);
				if(xMove > 0)
					direction = true;
				else if(xMove < 0)
					direction = false;
			} else if(game.getKeyManager().attack==true && !direction) {
				changeImage(Asset.warriorAttackLeft);
				swordX = (int) x;
				swordY = (int) y + height / 2 + 12;
				sword = new Rectangle(swordX, swordY, 30, 30);
				if(xMove > 0)
					direction = true;
				else if(xMove < 0)
					direction = false;
			} else {
				swordX = -100;
				swordY = -100;
				sword = new Rectangle(swordX, swordY, 30, 30);
			}
		} else {
			xMove = 0;
			
			if(game.getKeyManager().left1==true) {
				changeImage(Asset.warriorMoveLeft);
				xMove-=speed;
			}
			
			if(game.getKeyManager().right1==true) {
				changeImage(Asset.warriorMoveRight);
				xMove+=speed;
			}
			
			if(game.getKeyManager().jump1==true) {
				changeImage(Asset.warriorStand);
				accelerate(0, -5);
			}
			if(game.getKeyManager().attack1==true && direction) {
				changeImage(Asset.warriorAttackRight);
				swordX = (int) x + width - 30;
				swordY = (int) y + height / 2 + 12;
				sword = new Rectangle(swordX, swordY, 30, 30);
				if(xMove > 0)
					direction = true;
				else if(xMove < 0)
					direction = false;
			} else if(game.getKeyManager().attack1==true && !direction) {
				changeImage(Asset.warriorAttackLeft);
				swordX = (int) x;
				swordY = (int) y + height / 2 + 12;
				sword = new Rectangle(swordX, swordY, 30, 30);
				if(xMove > 0)
					direction = true;
				else if(xMove < 0)
					direction = false;
			} else {
				swordX = -100;
				swordY = -100;
				sword = new Rectangle(swordX, swordY, 30, 30);
			}
			
		}
	}
	
	public BufferedImage getImage() {
		return Asset.warriorStand;
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(champImage, (int) x, (int) y, width, height, null);
		g.setColor(Color.red);
//		g.fillRect((int) sword.x, (int) sword.y, 50, 5);
//		g.fillRect((int)x+bounds.x, (int)y+bounds.y, bounds.width, bounds.height);
	}
	

}


