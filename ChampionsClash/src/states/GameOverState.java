package states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import championClash.Asset;
import championClash.Game;
import entities.Champion;

public class GameOverState extends State{
	
	private Champion winner;

	public GameOverState(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}
	
	public void setWinner(Champion winner){
		this.winner = winner;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 10000, 10000);
		g.drawImage(Asset.gameOver, 100, 100, 500, 500, null);
		g.drawImage(winner.getImage(), 800, 200, 250, 300, null);
		g.setColor(Color.WHITE);
		g.setFont(new Font("TimesRoman", Font.BOLD, 36));
		g.drawString("WINNER: ", 800, 100);
		
	}

}
