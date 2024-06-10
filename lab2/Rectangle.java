package lab2;

public class Rectangle {
	int x1;
	int y1;
	int x2;
	int y2;
	
	//Constructors------------------------------------
	public Rectangle() {}
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	//-------------------------------------------------
	
	//Getters-----------
	public int getX1() {
		return x1;
	}
	public int getY1() {
		return y1;
	}
	public int getX2() {
		return x2;
	}
	public int getY2() {
		return y2;
	}
	//------------------
	
	//Setters------------------
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	//-------------------------
	
	//Methods--------------------------------
	public double getArea() {
		return (x2 - x1) * (y1 - y2);
	}
	public double getPerimeter() {
		return 2*((x2 - x1) + (y1 - y2));
	}
	public double getDistanceToTheCenterOf(Rectangle anotherRectangle) {
		double xCenter1, yCenter1, xCenter2, yCenter2;
		xCenter1 = (x1 + x2) / 2;
		xCenter2 = (anotherRectangle.x1 + anotherRectangle.x2) / 2;
		yCenter1 = (y1 + y2) / 2;
		yCenter2 = (anotherRectangle.y1 + anotherRectangle.y2) / 2;
		if(xCenter1 - xCenter2 == 0) {
			return Math.abs(yCenter1 - yCenter2);
		}
		else if(yCenter1 - yCenter2 == 0) {
			return Math.abs(yCenter1 - yCenter2);
		}
		else {
			return Math.sqrt(Math.pow(xCenter1 - xCenter2, 2) + Math.pow(yCenter1 - yCenter2, 2));
		}
	}
	
	public String toString() {
		return "Rectangle{" + 
				"(" + x1 + 
				", " + y1 + "), (" + 
				x2 + ", " + y2 + 
				")}";
	}
}
