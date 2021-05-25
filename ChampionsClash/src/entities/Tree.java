package entities;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Game;
/**
 * Tree entity on GameState
 * @author Ethan Bar, Abhishek Garud - 5/23/21
 *
 */
public class Tree extends Entity{

	public Tree(Game game, float x, float y, int width, int height) {
		super(game, x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public Tree(Game game) {
		super(game);
	}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Asset.tree, (int)x, (int)y, width, height, null);
		
	}

}
