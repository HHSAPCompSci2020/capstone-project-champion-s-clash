package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{

	private boolean[] keys;
	public boolean left, right, left1, right1, jump, jump1, attack, attack1;
	
	public KeyManager(){
		keys = new boolean[256];
	}
	
	public void tick(){
		
		jump = keys[KeyEvent.VK_W];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		attack = keys[KeyEvent.VK_SHIFT];
		
		
		jump1 = keys[KeyEvent.VK_UP];
		left1 = keys[KeyEvent.VK_LEFT];
		right1 = keys[KeyEvent.VK_RIGHT];
		attack1 = keys[KeyEvent.VK_SPACE];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}