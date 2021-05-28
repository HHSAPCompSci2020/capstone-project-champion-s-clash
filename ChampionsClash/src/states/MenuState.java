package states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JOptionPane;

import championClash.Asset;
import championClash.Game;
import championClash.Handler;
import entities.MenuText;
import input.ClickListener;
import ui.CharacterSelection;
import ui.UIImageButton;
import ui.UIManager;

/**
 * Menu state of game, allows character selection.
 * @author Ethan Bar, Abhishek Garud - 5/24/21
 *
 */
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
				player1Selection.getAssignedCharacter().setPlayerOne();
				player2Selection.getAssignedCharacter().setPlayerTwo();
				handler.getGame().gameState.setP1(player1Selection.getAssignedCharacter());
				handler.getGame().gameState.setP2(player2Selection.getAssignedCharacter());
				State.setState(handler.getGame().gameState);
				handler.getGame().startTime=System.currentTimeMillis();
			}}));
		player1Selection = new CharacterSelection(handler.getGame(), 100, 550, 10, 10, 1, uiManager);
		player2Selection = new CharacterSelection(handler.getGame(), 800, 550, 10, 10, 2, uiManager);
	}
	
	public MenuState(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	/**
	 * ticks each object on main menu
	 */
	@Override
	public void tick() {
		uiManager.tick();
		menuText.tick();
		player1Selection.tick();
		player2Selection.tick();
		
	}
	/**
	 * Draws character selection screen, menu text, and start button.
	 */
	@Override
	public void draw(Graphics g) {
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, 10000, 10000);
		uiManager.draw(g);
		menuText.draw(g);
		player1Selection.draw(g);
		player2Selection.draw(g);
		g.setColor(Color.MAGENTA);
		g.setFont(new Font("TimesRoman", Font.BOLD, 15));
		g.drawString("Choose wisely, and enter...", 515, 520);
		g.drawString("P1 CONTROLS:", 30, 675);
		g.drawString("To move - W, A, D. To attack - SHIFT", 150, 675);
		g.drawString("P2 CONTROLS:", 700, 675);
		g.drawString("To move - UP, LEFT, RIGHT. To attack - SPACE", 820, 675);
		
	}

}
