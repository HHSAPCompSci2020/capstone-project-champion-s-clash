package entities;

import java.awt.Graphics;

import championClash.Asset;
import championClash.Game;

/**
 * Text shown on the main menu of the game.
 * @author Ethan Bar, Abhishek Garud - 5/23/21
 *
 */
public class MenuText extends Entity{

	public MenuText(Game game, float x, float y, int width, int height) {
		super(game, x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public MenuText(Game game) {
		super(game);
	}
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Asset.menuText, (int)x, (int)y, width, height, null);

		
	}

}
