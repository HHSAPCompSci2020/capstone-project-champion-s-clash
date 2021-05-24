package states;

import java.awt.Graphics;

import championClash.Game;
import championClash.Handler;

public abstract class State {

	private static State currentState = null;
	protected Game game;
	
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	//CLASS
	
	protected Handler handler;
	
	public State(Handler handler){
		this.handler = handler;
	}
	
	public State(Game game){
		this.game = game;
	}
	
	public abstract void tick();
	
	public abstract void draw(Graphics g);
	
}