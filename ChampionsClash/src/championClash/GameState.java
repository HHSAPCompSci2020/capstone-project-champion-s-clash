package championClash;

import java.awt.Graphics;

public class GameState extends State{

	Warrior warrior;
	public GameState(Game game) {
		super(game);
		warrior = new Warrior(100, 100);
	}
	@Override
	public void tick() {
		
		
	}

	@Override
	public void draw(Graphics g) {
		warrior.draw(g);
		
	}

}
