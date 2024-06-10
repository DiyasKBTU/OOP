package lab2;

public class AdvancedCircle {
	int radius;
	Point center;
	//Constructors-----------------------------------
	public AdvancedCircle() {}
	public AdvancedCircle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	//-------------------------------------------------
	//Getters-----------------
	public int getRadius() {
		return radius;
	}
	public Point getCenter() {
		return center;
	}
	//------------------------
	
	//Setters----------------------------
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	//-----------------------------------
	
	//Methods--------------------------------------------------
	public double getDistanceTo(AdvancedCircle anotherCircle) {
		return center.getDistance(anotherCircle.center);
	}
	
	public String toString() {
		return "Circle{Center = " + center + ", Radius = " + radius + '}';
	}
}
