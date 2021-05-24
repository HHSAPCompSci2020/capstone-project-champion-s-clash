package states;

import java.awt.Color;
import java.awt.Graphics;

import championClash.Asset;
import championClash.ClickListener;
import championClash.Game;
import championClash.Handler;
import championClash.UIImageButton;
import championClash.UIManager;
import entities.MenuText;

public class MenuState extends State{
	
	private UIManager uiManager;
	MenuText menuText;

	public MenuState(Handler handler) {
		super(handler);
		menuText = new MenuText(200, 90, 800, 300);
		// TODO Auto-generated constructor stub
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(450, 360, 300, 150, Asset.startButton1, Asset.startButton2, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}}));
	}
	
	public MenuState(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		uiManager.tick();
		menuText.tick();
		
	}

	@Override
	public void draw(Graphics g) {
		uiManager.draw(g);
		menuText.draw(g);
		
	}

}
