package states;

import java.awt.Graphics;

import championClash.Game;
import championClash.Handler;

/**
 * Base class of State, abstract methods.
 * @author Ethan Bar, Abhishek Garud - 5/23/21
 *
 */
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