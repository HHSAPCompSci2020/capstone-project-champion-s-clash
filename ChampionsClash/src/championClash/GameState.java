package championClash;

import java.awt.Color;
import java.awt.Graphics;

import characters.Archer;
import characters.Warrior;
import characters.Wizard;


public class GameState extends State{

	Warrior warrior;
	Wizard wizard;
	Archer archer;
	
	public Rectangle floor =  new Rectangle(0, 600, 500, 1170);
	public Rectangle platform1 = new Rectangle(390, 450, 200, 100);
	public Rectangle platform2 = new Rectangle(600, 450, 20, 200);
	public Rectangle platform3 = new Rectangle(900, 450, 20, 200);
	
	public GameState(Game game) {
		super(game);
		warrior = new Warrior(game, 100, 500);
		wizard = new Wizard(game, 400, 500);
		archer = new Archer(game, 700, 500);

	}
		
	@Override
	public void tick() {
		warrior.tick();
		archer.tick();
		wizard.tick();
		
	}

	@Override
	public void draw(Graphics g) {
		warrior.draw(g);
		wizard.draw(g);
		archer.draw(g);
		
		g.setColor(Color.GRAY);
		g.fillRect((int)floor.x, (int)floor.y, (int)floor.width, (int)floor.height);
		g.fillRect((int)platform1.x, (int)platform1.y, (int)platform1.width, (int)platform1.height);
		g.fillRect((int)platform2.x, (int)platform2.y, (int)platform2.width, (int)platform2.height);
		g.fillRect((int)platform3.x, (int)platform3.y, (int)platform3.width, (int)platform3.height);
		
		
	}

}
