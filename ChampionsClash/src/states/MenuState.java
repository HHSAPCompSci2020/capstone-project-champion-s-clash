package states;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

import championClash.Asset;
import championClash.CharacterSelection;
import championClash.ClickListener;
import championClash.Game;
import championClash.Handler;
import championClash.UIImageButton;
import championClash.UIManager;
import entities.MenuText;

public class MenuState extends State{
	
	private UIManager uiManager;
	MenuText menuText;
	CharacterSelection player1Selection, player2Selection;
	   

	public MenuState(Handler handler) {
		super(handler);
		menuText = new MenuText(handler.getGame(), 200, 90, 800, 300);
		// TODO Auto-generated constructor stub
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(450, 360, 300, 150, Asset.startButton1, Asset.startButton2, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}}));
		player1Selection = new CharacterSelection(100, 550, 10, 10, 1, uiManager);
		player2Selection = new CharacterSelection(800, 550, 10, 10, 2, uiManager);
	}
	
	public MenuState(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		uiManager.tick();
		menuText.tick();
		player1Selection.tick();
		player2Selection.tick();
		
	}

	@Override
	public void draw(Graphics g) {
		uiManager.draw(g);
		menuText.draw(g);
		player1Selection.draw(g);
		player2Selection.draw(g);
		
	}

}
