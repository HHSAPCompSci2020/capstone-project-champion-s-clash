package states;

import java.awt.Color;
import java.awt.Graphics;

import championClash.Game;
import championClash.Rectangle;
import entities.Archer;
import entities.Bush;
import entities.Champion;
import entities.Sky;
import entities.Tree;
import entities.Warrior;
import entities.Wizard;


public class GameState extends State{

	Warrior warrior;
	Wizard wizard;
	Archer archer;
	Bush bush1, bush2;
	Tree tree;
	Sky sky;
	
	public Rectangle floor =  new Rectangle(0, 600, 500, 1170);
	public Rectangle ceiling =  new Rectangle(0, 0, 500, 1170);
	public Rectangle wallLeft =  new Rectangle(-500, 0, 500, 2000);
	public Rectangle wallRight =  new Rectangle(1170, 0, 500, 2000);
	public Rectangle platform1 = new Rectangle(390, 450, 200, 100);
	
	public Rectangle platform2 = new Rectangle(600, 450, 40, 200);
	public Rectangle platform3 = new Rectangle(900, 450, 40, 200);
	
	public GameState(Game game) {
		super(game);
		warrior = new Warrior(game, 100, 487);
		wizard = new Wizard(game, 400, 487);
		archer = new Archer(game, 700, 487);
		tree = new Tree(20, 0, 400, 600);
		bush1 = new Bush(1000, 512, 110, 110);
		bush2 = new Bush(700, 512, 110, 110);
		sky = new Sky(0,0,1170, 720);

	}
		
	@Override
	public void tick() {
		warrior.tick();
		archer.tick();
		wizard.tick();
		bush1.tick();
		bush2.tick();
		tree.tick();
		sky.tick();

		
	}

	@Override
	public void draw(Graphics g) {
		sky.draw(g);
		g.setColor(Color.GRAY);
		g.fillRect((int)floor.x, (int)floor.y, (int)floor.width, (int)floor.height);
		g.fillRect((int)platform1.x, (int)platform1.y, (int)platform1.width, (int)platform1.height);
		g.fillRect((int)platform2.x, (int)platform2.y, (int)platform2.width, (int)platform2.height);
		g.fillRect((int)platform3.x, (int)platform3.y, (int)platform3.width, (int)platform3.height);
		
		bush1.draw(g);
		bush2.draw(g);
		tree.draw(g);
		warrior.draw(g);
		wizard.draw(g);
		archer.draw(g);
		hitsWorld(wizard);
		hitsWorld(archer);
		hitsWorld(warrior);
		
//		platform1.intersects(champ.hitBox) ||
//		platform2.intersects(champ.hitBox) ||
//		platform3.intersects(champ.hitBox)) {
//	champ.setyMove(0);
		
	}
	public boolean hitsWorld(Champion champ) {
		if(champ.getY() + champ.getHeight() >= floor.y) {
			champ.setY((int) (floor.y - 112));
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
			champ.setX((int) (wallRight.x - 42));
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
		
		if(((champ.getX() >= platform2.x && champ.getX() <= platform2.x+platform2.width) ||(champ.getX() +32>= platform2.x && champ.getX() + 32 <= platform2.x+platform2.width)) && champ.getY() + 32>platform2.y+platform2.height && champ.getY()<platform2.y+platform2.height){
			champ.setY(650);
			return true;
		}
		
		if(((champ.getX() >= platform3.x && champ.getX() <= platform3.x+platform3.width) ||(champ.getX() +32>= platform3.x && champ.getX() + 32 <= platform3.x+platform3.width)) && champ.getY() + 32>platform3.y+platform3.height && champ.getY()<platform3.y+platform3.height){
			champ.setY(650);
			return true;
		}
		
		if(((champ.getX() >= platform2.x && champ.getX() <= platform2.x+platform2.width) ||(champ.getX() +32>= platform2.x && champ.getX() + 32 <= platform2.x+platform2.width)) && champ.getY()<platform2.y && champ.getY()+32>=platform2.y){
			champ.setY((float)platform2.y);
			return true;
		}
		
		if(((champ.getX() >= platform3.x && champ.getX() <= platform3.x+platform3.width) ||(champ.getX() +32>= platform3.x && champ.getX() + 32 <= platform3.x+platform3.width)) && champ.getY()<platform3.y && champ.getY()+32>=platform3.y){
			champ.setY((float)platform3.y);
			return true;
		}
		
		
		
			
		return false;
	}


}
