package championClash;

import processing.core.PApplet;

public class Rectangle {

	public double x, y;
	public double width, height;
	Line l1, l2, l3, l4;
	public Rectangle(int x, int y, int height, int width) {
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
		l1 = new Line(x, y, x+width, y);
		l2 = new Line(x+width, y, x+width, y+height);
		l3 = new Line(x+width, y+height, x, y+height);
		l4 = new Line(x, y+height, x, y);
		
	}
	
	public void draw(PApplet drawer) {
		drawer.stroke(0,0,255);
		l1.draw(drawer);
		l2.draw(drawer);
		l3.draw(drawer);
		l4.draw(drawer);
		drawer.stroke(255,255,255);
	}
	
	public boolean intersects(Rectangle other) {
		if(l1.intersects(other.l1) || 
				l1.intersects(other.l2) ||
				l1.intersects(other.l3) ||
				l1.intersects(other.l4) ||
				l2.intersects(other.l1) ||
				l2.intersects(other.l2) ||
				l2.intersects(other.l3) ||
				l2.intersects(other.l4) ||
				l3.intersects(other.l1) ||
				l3.intersects(other.l2) ||
				l3.intersects(other.l3) ||
				l3.intersects(other.l4) ||
				l4.intersects(other.l1) ||
				l4.intersects(other.l2) ||
				l4.intersects(other.l3) ||
				l4.intersects(other.l4)
				) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
