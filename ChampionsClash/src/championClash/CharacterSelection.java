package championClash;

import java.awt.Graphics;

import entities.Champion;
import entities.Wizard;
import states.State;

public class CharacterSelection extends UIObject {
	
	private int playerNumber; 
	private Champion assignedCharacter;
	private Game game;
	private Champion[] availableChar;
	

	public CharacterSelection(float x, float y, int width, int height, int playerNumber, UIManager uiManager) {
		super(x, y, width, height);
		this.playerNumber=playerNumber;
		this.assignedCharacter = new Wizard(game);
		//uiManager.addObject(new UIImageButton(450, 360, 300, 150, Asset.startButton1, Asset.startButton2, new ClickListener() {

		/*	@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}}));
			*/
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		//g.drawImage(, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
		if(playerNumber == 1) {
			g.drawImage(Asset.p1Text, (int)x, (int)y+37, 250, 50, null);
			g.drawImage(Asset.arrowButton, (int)x+200, (int)y-125, 100, 50, null);
		}
		else if (playerNumber == 2) {
			g.drawImage(Asset.p2Text, (int)x, (int)y+37, 250, 50, null);
			g.drawImage(Asset.arrowButton, (int)x+200, (int)y-125, 100, 50, null);
		}
		
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
	}

}
