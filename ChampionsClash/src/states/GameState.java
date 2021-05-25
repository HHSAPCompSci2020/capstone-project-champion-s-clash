package states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import championClash.Asset;
import championClash.Game;
import championClash.Rectangle;
import entities.Archer;
import entities.Bush;
import entities.Champion;
import entities.Sky;
import entities.Tree;
import entities.Warrior;
import entities.Wizard;


public class GameState extends State {
	Champion p1, p2;
	Warrior warrior;
	Wizard wizard;
	Archer archer;
	Bush bush1, bush2;
	Tree tree;
	Sky sky;
	private int timeLeft;
	
	public Rectangle floor =  new Rectangle(0, 600, 500, 1170);
	public Rectangle ceiling =  new Rectangle(0, 0, 500, 1170);
	public Rectangle wallLeft =  new Rectangle(-500, 0, 500, 2000);
	public Rectangle wallRight =  new Rectangle(1170, 0, 500, 2000);
	public Rectangle platform1 = new Rectangle(390, 450, 200, 100);
	public Rectangle platform2 = new Rectangle(600, 450, 40, 200);
	public Rectangle platform3 = new Rectangle(900, 450, 40, 200);
	
	public GameState(Game game) {
		super(game);
		tree = new Tree(game, 20, 0, 400, 600);
		bush1 = new Bush(game, 1000, 512, 110, 110);
		bush2 = new Bush(game, 700, 512, 110, 110);
		sky = new Sky(game, 0,0,1170, 720);

	}
	
	public void gameOver(Champion c) {
		game.gameOverState.setWinner(c);
		State.setState(game.gameOverState);
	}
		
	@Override
	public void tick() {
		p1.tick();
		p2.tick();
		bush1.tick();
		bush2.tick();
		tree.tick();
		sky.tick();
		timeLeft = (int)((game.startTime+60000-System.currentTimeMillis())/1000);
		
		if (p1.isDead()) {
			gameOver(p2);
		} else if(p2.isDead()) {
			gameOver(p1);
		} else {
			if (timeLeft <= 0) {
				if (p1.getHealth() > p2.getHealth()) {
					gameOver(p1);
				} else {
					gameOver(p2);
				}
			}
		}
	}

	public void setP1(Champion p) {
		p1 = p;
		p1.setX(100);
		p1.setY(487);
	}
	
	public void setP2(Champion p) {
		p2 = p;
		p1.setX(700);
		p1.setY(487);
	}
	
	@Override
	public void draw(Graphics g) {
		sky.draw(g);
		g.setColor(Color.GRAY);
		g.fillRect((int)floor.x, (int)floor.y, (int)floor.width, (int)floor.height);
		g.fillRect((int)platform1.x, (int)platform1.y, (int)platform1.width, (int)platform1.height);
		g.fillRect((int)platform2.x, (int)platform2.y, (int)platform2.width, (int)platform2.height);
		g.fillRect((int)platform3.x, (int)platform3.y, (int)platform3.width, (int)platform3.height);
		g.setFont(new Font("TimesRoman", Font.BOLD, 36));
		g.drawString("Time left: " + timeLeft + " seconds", 800, 100);
		bush1.draw(g);
		bush2.draw(g);
		tree.draw(g);
		p1.draw(g);
		p2.draw(g);
		hitsWorld(p1);
		hitsWorld(p2);
		p1.takeDamage(p2);
		p2.takeDamage(p1);
		p1.ifDie();
		p2.ifDie();
	}
	
	public boolean hitsWorld(Champion champ) {
		if(champ.getY() + champ.getHeight() >= floor.y) {
			champ.setY((int) (floor.y) - 105);
			return true;
		}
		if(champ.getY() < ceiling.y) {
			champ.setY((int) (ceiling.y));
			return true;
		}
		if(champ.getX() <= wallLeft.x + 500) {
			champ.setX((int) wallLeft.x + 500);
			return true;
		}
		if(champ.getX() + 32 >= wallRight.x) {
			champ.setX((int) (wallRight.x - 32));
			return true;
		}
		if(champ.getX() >= 345 && champ.getX() <= 420 && champ.getY() >= 450) {
			champ.setX(345);
			return true;
		}
		if(champ.getX() <= 477 && champ.getX() >= 420 && champ.getY() >= 450) {
			champ.setX(475);
			return true;
		}
		if(champ.getX() <= 477 && champ.getX() >= 345 && champ.getY() + champ.getHeight() >= 450 && champ.getY() + champ.getHeight() <= 480){
			champ.setY(350);
			return true;
		}
		if(champ.getX() >= platform2.x - 40 && champ.getX() <= platform2.x + platform2.width - 10 && champ.getY() + champ.getHeight() >= platform2.y && champ.getY() + champ.getHeight() <= platform2.y + platform2.height/2) {
			champ.setY((float) platform2.y - champ.getHeight());
			return true;
		}
		if(champ.getX() >= platform2.x - 40 && champ.getX() <= platform2.x + platform2.width - 10 && champ.getY() >= platform2.y + platform2.height/2 - 20 && champ.getY() <= platform2.y + platform2.height) {
			champ.setyMove((float) 5);
			return true;
		}
		if(champ.getX() >= platform3.x - 40 && champ.getX() <= platform3.x + platform3.width - 10 && champ.getY() + champ.getHeight() >= platform3.y && champ.getY() + champ.getHeight() <= platform3.y + platform3.height/2) {
			champ.setY((float) platform3.y - champ.getHeight());
			return true;
		}
		if(champ.getX() >= platform3.x - 40 && champ.getX() <= platform3.x + platform3.width - 10 && champ.getY() >= platform3.y + platform3.height/2 - 20 && champ.getY() <= platform3.y + platform3.height) {
			champ.setyMove((float) 5);
			return true;
		}
			
		return false;
	}


}
