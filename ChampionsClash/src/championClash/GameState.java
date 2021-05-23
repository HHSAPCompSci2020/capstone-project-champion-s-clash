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
		
	}

}
