package entities;

import java.awt.Graphics;

import championClash.Game;
import championClash.Rectangle;

public abstract class Champion extends Entity{
	
	public static final int DEFAULT_HEALTH = 100;
	public static final float DEFAULT_SPEED = 30f;
	public static final int DEFAULT_CHAMPION_WIDTH = 70,
							DEFAULT_CHAMPION_HEIGHT = 100;
	
	protected int health;
	protected float speed;
	protected float xMove, yMove;
	protected double gravity;
	

	public Champion(Game game, float x, float y, int width, int height) {
		super(game, x, y, width, height);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
		gravity = 0.95;
	}
	
	public Champion(Game game) {
		super(game);
	}
	
	public void accelerate(double ax, double ay) {
		xMove += ax;
		yMove += ay;
		
	}
	
	public void setLoc(float x, float y) {
		setX(x);
		setY(y);
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
	
}

