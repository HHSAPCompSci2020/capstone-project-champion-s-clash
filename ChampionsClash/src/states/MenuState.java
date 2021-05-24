package states;

import java.awt.Color;
import java.awt.Graphics;

import championClash.Game;
import championClash.Handler;

public class MenuState extends State{

	public MenuState(Handler handler) {
		super(handler);
		// TODO Auto-generated constructor stub
	}
	
	public MenuState(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void tick() {
		if(handler.getMouseManager().isPressed())
			State.setState(handler.getGame().gameState);
		
	}

	@Override
	public void draw(Graphics g) {
		
		g.setColor(Color.RED);
		g.fillOval(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 15, 15);
		
	}

}
