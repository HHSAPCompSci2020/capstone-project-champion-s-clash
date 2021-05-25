package entities;

import java.awt.Graphics;

import championClash.Game;
import championClash.Rectangle;
import java.awt.image.BufferedImage;

public abstract class Champion extends Entity{
	
	public static final int DEFAULT_HEALTH = 100;
	public static final float DEFAULT_SPEED = 30f;
	public static final int DEFAULT_CHAMPION_WIDTH = 70,
							DEFAULT_CHAMPION_HEIGHT = 100;
	
	protected int health;
	protected float speed;
	protected float xMove, yMove;
	protected double gravity;
	protected Rectangle hitBox;
	protected BufferedImage champImage;
	protected boolean isPlayerOne;
	

	public Champion(Game game, float x, float y, int width, int height, BufferedImage image) {
		super(game, x, y, width, height);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
		gravity = 0.95;
		hitBox = new Rectangle((int)x+bounds.x, (int)y+bounds.y, bounds.width, bounds.height);
		champImage = image;
	}
	
	public Champion(Game game) {
		super(game);
	}
	
	public void setPlayerOne() {
		isPlayerOne = true;
	}
	
	public void setPlayerTwo() {
		isPlayerOne = false;
	}
	
	public boolean isPlayerOne() {
		return isPlayerOne;
	}
	
	public boolean isPlayerTwo() {
		return !isPlayerOne();
	}
	
	public void accelerate(double ax, double ay) {
		xMove += ax;
		yMove += ay;
		
	}
	
	public void move(){
		x += xMove;
		y += yMove;
	}

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	public abstract BufferedImage getImage();

	public void changeImage(BufferedImage image) {
		champImage = image;
	}
	
	public void updateHitBox() {
		hitBox = new Rectangle((int)x+bounds.x, (int)y+bounds.y, bounds.width, bounds.height);
	}
	
	public void takeDamage(Champion c) {
		if (c instanceof Archer) {
			takeDamageArcher((Archer)c);
		} else if (c instanceof Wizard) {
			takeDamageWizard((Wizard)c);
		} else if (c instanceof Warrior) {
			takeDamageWarrior((Warrior)c);
		}
	}
	
	public void takeDamageArcher(Archer archer) {
		updateHitBox();
		if(archer.arrow.intersects(hitBox)) {
			health-=25;
			archer.arrowX = -100;
			archer.arrowY = -100;
		}
	}
	
	public void takeDamageWizard(Wizard wizard) {
		updateHitBox();
		if(wizard.fireBall.intersects(hitBox)) {
			health-=34;
			wizard.fireBallX = -100;
			wizard.fireBallY = -100;
		}
	}
	
	public void takeDamageWarrior(Warrior warrior) {
		updateHitBox();
		if(warrior.sword.intersects(hitBox)) {
			health-=50;
			warrior.swordX = -100;
			warrior.swordY = -100;
				yMove-=50;
		}
	}
	
	public void remove() {
		x = -100;
		y = -100;
	}
	
	public boolean isDead() {
		if(health <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void ifDie() {
		if(health <= 0)
			remove();
		
	}
	
}

