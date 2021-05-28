package entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import championClash.Asset;
import championClash.Game;
import championClash.Rectangle;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Archer subclass of Champion.
 * @author Ethan Bar, Abhishek Garud - 5/24/21
 *
 */
public class Archer extends Champion{
	
	private Game game;
	Rectangle arrow;
	int arrowX;
	int arrowY;
	boolean direction;

	public Archer(Game game, float x, float y, BufferedImage image) {
		super(game, x, y, Champion.DEFAULT_CHAMPION_WIDTH-20, Champion.DEFAULT_CHAMPION_HEIGHT, image);
		this.game = game;
		speed = 6;
		arrowX = -100;
		arrowY = -100;
		arrow = new Rectangle(arrowX, arrowY, 5, 15);
		bounds.x= 15;
		bounds.y = 32;
		bounds.width = 32;
		bounds.height = 68;
		direction = true;
	}
	
	public Archer(Game game) {
		this(game, 0, 0, Asset.archerStand);
	}

	@Override
	public void tick() {
		getInput();
		move();
		
		arrow = new Rectangle(arrowX, arrowY, 30, 5);

		if(direction)
			arrowX+=10;
		if(!direction)
			arrowX-=10;
		
		yMove = (float) (yMove * gravity + 0.65);
	}
	
	
	private void getInput(){
		if (isPlayerOne()) {
			xMove = 0;
		
			if(game.getKeyManager().left==true) {
				xMove-=speed;
				changeImage(Asset.archerMoveLeft);
			}
			
			if(game.getKeyManager().right==true) {
				xMove+=speed;
				changeImage(Asset.archerMoveRight);
			}
			
			if(game.getKeyManager().jump==true) {
				accelerate(0, -2);
				changeImage(Asset.archerStand);
			}
			if(game.getKeyManager().attack==true) {
				changeImage(Asset.archerAttack);
				arrowX = (int) x + width;
				arrowY = (int) y + height / 2 + 10;
				if(xMove > 0)
					direction = true;
				else if(xMove < 0)
					direction = false;
					
			}
		} else {
			xMove = 0;
			
			if(game.getKeyManager().left1==true) {
				xMove-=speed;
				changeImage(Asset.archerMoveLeft);
			}
			
			if(game.getKeyManager().right1==true) {
				xMove+=speed;
				changeImage(Asset.archerMoveRight);
			}
			
			if(game.getKeyManager().jump1==true) {
				accelerate(0, -2);
				changeImage(Asset.archerStand);
			}
			if(game.getKeyManager().attack1==true) {
				changeImage(Asset.archerAttack);
				arrowX = (int) x + width;
				arrowY = (int) y + height / 2 + 10;
				if(xMove > 0)
					direction = true;
				else if(xMove < 0)
					direction = false;
					
			}
		}
	}
	
	public BufferedImage getImage() {
		return Asset.archerStand;
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(champImage, (int) x, (int) y, width, height, null);
		g.setColor(Color.YELLOW);
		g.fillRect((int) arrow.x, (int) arrow.y, 30, 5);
//		g.fillRect((int)x+bounds.x, (int)y+bounds.y, bounds.width, bounds.height);
	}
}
