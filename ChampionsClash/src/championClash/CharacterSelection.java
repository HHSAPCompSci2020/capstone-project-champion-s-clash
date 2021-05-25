package championClash;

import java.awt.Graphics;

import entities.Archer;
import entities.Champion;
import entities.Warrior;
import entities.Wizard;
import states.State;

public class CharacterSelection extends UIObject {
	
	private int playerNumber; 
	private Champion assignedCharacter;
	private Game game;
	
	private Champion[] availableChars;
	private int currCharIndex;
	

	public CharacterSelection(Game game, float x, float y, int width, int height, int playerNumber, UIManager uiManager) {
		super(x, y, width, height);
		this.game = game;
		availableChars = new Champion[3];
		availableChars[0] = new Wizard(game);
		availableChars[1] = new Warrior(game);
		availableChars[2] = new Archer(game);
		this.playerNumber=playerNumber;
		this.currCharIndex = 0;
		this.assignedCharacter = availableChars[currCharIndex];
		uiManager.addObject(new UIImageButton((int)x+200, (int)y-125, 100, 76, Asset.arrowButton, Asset.arrowButton, new ClickListener() {

		@Override
			public void onClick() {
			    pickNextCharacter();
			}}));
		// TODO Auto-generated constructor stub
	}

	public Champion getAssignedCharacter() {
		return assignedCharacter;
	}
	
	private void pickNextCharacter() {
		currCharIndex = (currCharIndex+1)%3;
		assignedCharacter = availableChars[currCharIndex];
	}
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		//g.drawImage(, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, null);
		if(playerNumber == 1) {
			g.drawImage(assignedCharacter.getImage(), (int)x+70, (int)y-170, null);
			g.drawImage(Asset.p1Text, (int)x, (int)y+37, 250, 50, null);
		}
		else if (playerNumber == 2) {
			g.drawImage(assignedCharacter.getImage(), (int)x+70, (int)y-170, null);
			g.drawImage(Asset.p2Text, (int)x, (int)y+37, 250, 50, null);
		}
		
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
	}

}
