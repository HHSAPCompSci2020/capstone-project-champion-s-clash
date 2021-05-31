package entities;

import java.awt.Graphics;

import championClash.Game;
import championClash.Rectangle;
import java.awt.image.BufferedImage;

/**
 * Class for a Champion, a playable character.
 * @author Ethan Bar, Abhishek Garud - 5/24/21
 *
 */
public abstract class Champion extends Entity{
	
	public static final int DEFAULT_HEALTH = 100;
	public static final float DEFAULT_SPEED = 30f;
	public static final int DEFAULT_CHAMPION_WIDTH = 70,
							DEFAULT_CHAMPION_HEIGHT = 100;
	
	protected int health;
	protected float speed;
	protected float xMove, yMove;
	protected double gravity;
	public Rectangle hitBox;
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
	
	/**
	 * Sets isPlayerOne boolean to true.
	 */
	public void setPlayerOne() {
		isPlayerOne = true;
	}
	
	/**
	 * Sets isPlayerOne boolean to false.
	 */
	public void setPlayerTwo() {
		isPlayerOne = false;
	}
	
	/**
	 * Gets isPlayerOne boolean.
	 */
	public boolean isPlayerOne() {
		return isPlayerOne;
	}
	
	/**
	 * Gets false isPlayerOne boolean.
	 */
	public boolean isPlayerTwo() {
		return !isPlayerOne();
	}
	
	/**
	 * Accelerates Champion based on horizontal and vertical components.
	 * @param ax horizontal component of acceleration
	 * @param ay vertical component of acceleration
	 */
	public void accelerate(double ax, double ay) {
		xMove += ax;
		yMove += ay;
		
	}
	
	/**
	 * Moves the Champion across the screen based on acceleration.
	 */
	public void move(){
		x += xMove;
		y += yMove;
	}

	/**
	 * Getter method for horizontal acceleration
	 * @return horizontal acceleration
	 */
	public float getxMove() {
		return xMove;
	}

	/**
	 * Sets horizontal acceleration to float passed in
	 * @param xMove horizontal acceleration to be set
	 */
	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	/**
	 * Getter method for vertical acceleration
	 * @return vertical acceleration
	 */
	public float getyMove() {
		return yMove;
	}

	/**
	 * Sets vertical acceleration to float passed in
	 * @param yMove vertical acceleration to be set
	 */
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

	/**
	 * Changes champImage to image passed in.
	 * @param image image to be set as champImage
	 */
	public void changeImage(BufferedImage image) {
		champImage = image;
	}
	
	/**
	 * Updates hitBox of Champion.
	 */
	public void updateHitBox() {
		hitBox = new Rectangle((int)x+bounds.x, (int)y+bounds.y, bounds.width, bounds.height);
	}
	
	/**
	 * Takes damage from all characters on screen who launch attacks.
	 * @param c Attacking champion
	 */
	public void takeDamage(Champion c) {
		if (c instanceof Archer) {
			takeDamageArcher((Archer)c);
		} else if (c instanceof Wizard) {
			takeDamageWizard((Wizard)c);
		} else if (c instanceof Warrior) {
			takeDamageWarrior((Warrior)c);
		}
	}
	/**
	 * If champion is hit by arrow, health is decremented.
	 * @param archer archer attacking
	 */
	public void takeDamageArcher(Archer archer) {
		updateHitBox();
		if(archer.arrow.intersects(hitBox)) {
			health-=5;
			archer.arrowX = -100;
			archer.arrowY = -100;
		}
	}
	/**
	 * If champion is hit by fireBall, health is decremented.
	 * @param wizard wizard attacking
	 */
	public void takeDamageWizard(Wizard wizard) {
		updateHitBox();
		if(wizard.fireBall.intersects(hitBox)) {
			health-=8;
			wizard.fireBallX = -100;
			wizard.fireBallY = -100;
		}
	}
	/**
	 * If champion is hit by sword, health is decremented.
	 * @param warrior warrior attacking
	 */
	public void takeDamageWarrior(Warrior warrior) {
		updateHitBox();
		if(warrior.sword.intersects(hitBox)) {
			health-=10;
			warrior.swordX = -100;
			warrior.swordY = -100;
				yMove-=10;
		}
	}
	
	/**
	 * Removes Champion from game.
	 */
	public void remove() {
		x = -100;
		y = -100;
	}
	
	/**
	 * Determines if Champion is dead or not.
	 * @return boolean determining if champion is dead.
	 */
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

