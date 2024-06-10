package lab2;

public class Point {
	int x;
	int y;
	
	public Point() {}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(Point point) {
		if(this.x - point.x == 0) {
			return Math.abs(y - point.y);
		}
		else if(this.y - point.y == 0) {
			return Math.abs(this.x - point.x);
		}
		else {
			return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
		}
	}
	
	public String toString() {
		return "Point = (" + x + ", " + y + ")";
	}
}
