package lab2;

public class AdvancedCircle {
	int radius;
	Point center;
	
	public AdvancedCircle() {}
	public AdvancedCircle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public double getDistanceTo(AdvancedCircle anotherCircle) {
		return center.getDistance(anotherCircle.center);
	}
}
