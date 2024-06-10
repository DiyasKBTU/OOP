package lab2;

public class AdvancedRectangle {
	Point topLeft;
	Point bottomRight;
	public AdvancedRectangle() {}
	public AdvancedRectangle(Point topLeft, Point bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	public double getArea() {
		return (bottomRight.x - topLeft.x) * (topLeft.y - bottomRight.y);
	}
	public double getPerimeter() {
		return 2*((bottomRight.x - topLeft.x) + (topLeft.y - bottomRight.y));
	}
	public double getDistanceToTheCenterOf(AdvancedRectangle anotherRectangle) {
		double xCenter1, yCenter1, xCenter2, yCenter2;
		xCenter1 = (topLeft.x + bottomRight.x) / 2;
		xCenter2 = (anotherRectangle.topLeft.x + anotherRectangle.bottomRight.x) / 2;
		yCenter1 = (topLeft.y + bottomRight.y) / 2;
		yCenter2 = (anotherRectangle.topLeft.y + anotherRectangle.bottomRight.y) / 2;
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
				"(" + topLeft.x + 
				", " + topLeft.y + "), (" + 
				bottomRight.x + ", " + bottomRight.y + 
				")}";
	}
}
