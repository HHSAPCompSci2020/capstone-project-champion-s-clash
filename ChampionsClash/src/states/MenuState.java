package states;

import java.awt.Color;
import java.awt.Graphics;

import championClash.Asset;
import championClash.ClickListener;
import championClash.Game;
import championClash.Handler;
import championClash.UIImageButton;
import championClash.UIManager;

public class MenuState extends State{
	
	private UIManager uiManager;

	public MenuState(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		
		uiManager.addObject(new UIImageButton(200, 200, 128, 64, Asset.startButton1, Asset.startButton2, new ClickListener() {

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
		
	}

	@Override
	public void draw(Graphics g) {
		uiManager.draw(g);
		
	}

}
