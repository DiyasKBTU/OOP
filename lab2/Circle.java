package lab2;

public class Circle {
	int xCoordinate;
	int yCoordinate;
	int radius;
	
	public Circle(int xCoordinate, int yCoordinate, int radius) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.radius = radius;
	}
	
	public int getXCoordinate() {
		return xCoordinate;
	}
	
	public int getYCoordinate() {
		return yCoordinate;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setXCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	
	public void setYCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius*radius;
	}
	public double getCircumference() {
		return Math.PI * 2 * radius;
	}
	public double getDistanceTo(Circle anotherCircle) {
		if(this.xCoordinate - anotherCircle.xCoordinate == 0) {
			return Math.abs(this.yCoordinate - anotherCircle.yCoordinate);
		}
		else if(this.yCoordinate - anotherCircle.yCoordinate == 0) {
			return Math.abs(this.xCoordinate - anotherCircle.xCoordinate);
		}
		else {
			return Math.sqrt(Math.pow(this.xCoordinate - anotherCircle.xCoordinate, 2) + Math.pow(this.yCoordinate - anotherCircle.yCoordinate, 2));
		}
	}
	
	public String toString() {
		return "Circle{" + 
				"xCoordinate=" + xCoordinate + 
				", yCoordinate=" + yCoordinate + 
				", radius=" + radius + 
				'}';
	}
}
