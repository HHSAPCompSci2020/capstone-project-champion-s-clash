package championClash;

import processing.core.PApplet;

public class Line {

	double x1, y1, x2, y2;
	public static void main(String[] args) {
		

	}

	public Line(double x1, double y1, double x2, double y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		
	}

	
	public void setPoint2(double x2, double y2) {
		this.x2=x2;
		this.y2=y2;
	}
	public void draw(PApplet drawer) {
		drawer.line((float)x1,(float) y1,(float) x2,(float) y2);
	}
	public double getIntersectionX(Line other) {
		double denom = ((x1-x2)*(other.y1-other.y2)-(y1-y2)*(other.x1-other.x2));
		if(denom==0) {
			return -1;
		}
		return (((x1*y2-y1*x2)*(other.x1-other.x2)-(x1-x2)*(other.x1*other.y2-other.y1*other.x2))/denom);                         
	}
	public double getIntersectionY(Line other) {
		double denom = ((x1-x2)*(other.y1-other.y2)-(y1-y2)*(other.x1-other.x2));
		if(denom==0) {
			return -1;
		}
		return (((x1*y2-y1*x2)*(other.y1-other.y2)-(y1-y2)*(other.x1*other.y2-other.y1*other.x2))/denom); 
	}
	public boolean intersects(Line other) {
		double intersectionX = getIntersectionX(other);
		double intersectionY = getIntersectionY(other);
		if(intersectionX==-1 && intersectionY==-1) {
			return false;
		}
		if(isBetween(intersectionX, intersectionY)&&
			other.isBetween(intersectionX, intersectionY )) {
			return true;
		}
		return false;
	}
	
	private boolean isBetween(double x, double y) {
		if(((x>=x1) && (x<=x2) || (x<=x1) && (x>=x2)) &&
		    ((y>=y1) && (y<=y2) || (y<=y1) && (y>=y2))) {
		return true;
		}
	return false;
	}
}
