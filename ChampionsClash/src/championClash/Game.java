package championClash;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Game implements Runnable {

	private Display display;
	public int width, height;
	public String title;
	
	private boolean running = false;
	private Thread thread;
	
	private BufferStrategy bs;
	private Graphics g;
	
	//States
	private State gameState;
	private State menuState;
	
	public Rectangle floor =  new Rectangle(0, 600, 500, 1170);
	public Rectangle platform1 = new Rectangle(390, 450, 200, 100);
	public Rectangle platform2 = new Rectangle(600, 450, 20, 200);
	public Rectangle platform3 = new Rectangle(900, 450, 20, 200);
	
	//Input
	private KeyManager keyManager;
	
	public Game(String title, int width, int height){
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
	}
	
	private void initialize(){
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		Asset.initialize();
		
		gameState = new GameState(this);
		menuState = new MenuState(this);
		State.setState(gameState);
	}
	
	private void tick(){
		keyManager.tick();
		
		if(State.getState() != null)
			State.getState().tick();
	}
	
	private void render(){
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
		
		g.setColor(Color.GRAY);
		g.fillRect((int)floor.x, (int)floor.y, (int)floor.width, (int)floor.height);
		g.fillRect((int)platform1.x, (int)platform1.y, (int)platform1.width, (int)platform1.height);
		g.fillRect((int)platform2.x, (int)platform2.y, (int)platform2.width, (int)platform2.height);
		g.fillRect((int)platform3.x, (int)platform3.y, (int)platform3.width, (int)platform3.height);
		
		//End Drawing!
		bs.show();
		g.dispose();
	}
	
	public void run(){
		
		initialize();
		
		int fps = 60;
		double timePerTick = 1000000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running){
			now = System.nanoTime();
			delta += (now - lastTime) / timePerTick;
			timer += now - lastTime;
			lastTime = now;
			
			if(delta >= 1){
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if(timer >= 1000000000){
				System.out.println("Ticks and Frames: " + ticks);
				ticks = 0;
				timer = 0;
			}
		}
		
		stop();
		
	}
	
	public KeyManager getKeyManager(){
		return keyManager;
	}
	
	public synchronized void start(){
		if(running)
			return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
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
