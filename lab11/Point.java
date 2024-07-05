package lab11;


class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int compareTo(Point other) {
        if(this.x == other.x) {
    		if(this.y > other.y) {
    			return 1;
    		}
    		else if(this.y == other.y) {
    			return 0;
    		}
    		else {
    			return -1;
    		}
    	}
    	else {
    		if(this.x > other.x) {
    			return 1;
    		}
    		else if(this.x == other.x) {
    			return 0;
    		}
    		else {
    			return -1;
    		}
    	}
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
