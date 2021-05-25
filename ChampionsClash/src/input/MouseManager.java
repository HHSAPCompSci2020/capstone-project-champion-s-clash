package input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import ui.UIManager;
/**
 * Determines when buttons are clicked, and gets various stats.
 * @author Ethan Bar, Abhishek Garud - 5/23/21
 *
 */
public class MouseManager implements MouseListener, MouseMotionListener{
	
	private boolean pressed;
	private int mouseX, mouseY;
	private UIManager uiManager;
	
	public MouseManager() {
		
	}
	
	public void setUIManager(UIManager uiManager) {
		this.uiManager=uiManager;
	}
	
	public boolean isPressed() {
		return pressed;
	}
	
	public int getMouseX() {
		return mouseX;
	}
	
	public int getMouseY() {
		return mouseY;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Gets locations of mouse as it moves.
	 */
	@Override
	public void mouseMoved(MouseEvent e) {
		mouseX = e.getX();
		mouseY = e.getY();
		
		if(uiManager != null) {
			uiManager.onMouseMove(e);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Sets pressed boolean to true if mouse is clicked.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1) {
			pressed = true;
		}
		
	}

	/**
	 * Sets pressed boolean to false if mouse is released.
	 */
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1) {
			pressed = false;
		}
		
		if(uiManager != null) {
			uiManager.onMouseRelease(e);
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
