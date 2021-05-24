package championClash;

import java.awt.Color;
import java.awt.Graphics;

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
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 8, 8);
	}

}
