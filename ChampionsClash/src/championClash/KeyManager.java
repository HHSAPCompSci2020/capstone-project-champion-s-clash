package championClash;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{

	public boolean[] keys;
	public boolean left, right, jump;
	public boolean left1, right1, jump1;
	
	public KeyManager() {
		keys = new boolean[256];
	}
	public void tick() {
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
		left1 = keys[KeyEvent.VK_A];
		right1 = keys[KeyEvent.VK_D];
		jump = keys[KeyEvent.VK_UP];
		jump1 = keys[KeyEvent.VK_W];
	}
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()]=true;
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()]=false;
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
