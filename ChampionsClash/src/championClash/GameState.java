package championClash;

import java.awt.Graphics;

import characters.Archer;
import characters.Warrior;
import characters.Wizard;


public class GameState extends State{

	Warrior warrior;
	Wizard wizard;
	Archer archer;
	public GameState(Game game) {
		super(game);
		warrior = new Warrior(game, 100, 400);
		wizard = new Wizard(game, 400, 400);
		archer = new Archer(game,700,400);
		
	}
	@Override
	public void tick() {
		warrior.tick();
		wizard.tick();
		archer.tick();
		
	}

	@Override
	public void draw(Graphics g) {
		warrior.draw(g);
		wizard.draw(g);
		archer.draw(g);
		
	}

}
