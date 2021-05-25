package entities;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Game;

/**
 * Bush entity on GameState.
 * @author Ethan Bar, Abhishek Garud - 5/23/21
 *
 */
public class Bush extends Entity{

	public Bush(Game game, float x, float y, int width, int height) {
		super(game, x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public Bush(Game game) {
		super(game);
	}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Asset.bush, (int)x, (int)y, width, height, null);
		
	}

}
