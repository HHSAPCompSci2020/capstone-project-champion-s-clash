package championClash;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import entities.Champion;
import input.KeyManager;
import input.MouseManager;
import states.GameOverState;
import states.GameState;
import states.MenuState;
import states.State;

/**
 * Main Game class. Stores champions, width, height, and display.
 * @author Ethan Bar, Abhishek Garud - 5/24/21
 *
 */
public class Game implements Runnable {

	private Display display;
	private int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	public Champion p1, p2;
	
	
	//States
	public GameState gameState;
	public MenuState menuState;
	public GameOverState gameOverState;
	public long startTime;
	
	//Input
	private KeyManager keyManager;
	private MouseManager mouseManager;
	
	
	//Handler
	private Handler handler;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		mouseManager = new MouseManager();
	}
	
	/**
	 * Class to initialize GameStates and add frames and canvases for input features(MouseListener, KeyListener, MouseMotionListener)
	 * No parameters. 
	 */
	private void init(){
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		Asset.initialize();
		
		handler = new Handler(this);
		
		gameState = new GameState(handler.getGame());
		menuState = new MenuState(handler);
		gameOverState = new GameOverState(handler.getGame());
		State.setState(menuState);
	}
	
	/**
	 * Ticks whichever state the game is in, as well as the keyManager class.
	 */
	private void tick(){
		keyManager.tick();
		
		if(State.getState() != null)
			State.getState().tick();
	}
	
	/**
	 * Draws different GameStates on Canvas.
	 */
	private void draw(){
		bs = display.getCanvas().getBufferStrategy();
		if(bs == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		//Clear Screen
		g.clearRect(0, 0, width, height);
		//Draw Here!
		
		if(State.getState() != null)
			State.getState().draw(g);
		
		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	/**
	 * Calls initialize method, sets FPS speed, and starts game.
	 */
	public void run(){
		
		init();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				tick();
				draw();
				delta--;
			}
			
			if(timer >= 1000000000){
				timer = 0;
			}
		}
		
		stop();
		
	}
	
	/**
	 * Sets the Champion of player 1 to the Champion passed in.
	 * @param player1Champ Champion that p1 is set to.
	 */
	public void setPlayer1Champ(Champion player1Champ) {
		p1 = player1Champ;
	}
	
	/**
	 * Sets the Champion of player 2 to the Champion passed in.
	 * @param player2Champ Champion that p2 is set to.
	 */
	public void setPlayer2Champ(Champion player2Champ) {
		p2 = player2Champ;
	}
	
	/**
	 * Returns the champion of player 1.
	 */
	public Champion getPlayer1Champ() {
		return p1;
	}
	
	/**
	 * Returns the champion of player 2.
	 */
	public Champion getPlayer2Champ() {
		return p2;
	}
	
	/**
	 * Returns the KeyManager.
	 */
	public KeyManager getKeyManager(){
		return keyManager;
	}
	
	/**
	 * Returns the MouseManager.
	 */
	public MouseManager getMouseManager(){
		return mouseManager;
	}
	
	/**
	 * Returns the width of the current game.
	 */
	public int getWidth(){
		return width;
	}
	
	/**
	 * Returns the height of the current game.
	 */
	public int getHeight(){
		return height;
	}
	
	/**
	 * Starts game by setting running boolean to true and starting new Thread.
	 */
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	/**
	 * Stops game with try-and-catch statement.
	 */
	public synchronized void stop(){
		if(!running)
			return;
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

