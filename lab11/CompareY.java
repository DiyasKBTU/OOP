package lab11;

import java.util.Comparator;

class CompareY implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
        if(p1.getY() == p2.getY()) {
    		if(p1.getX() > p2.getX()) {
    			return 1;
    		}
    		else if(p1.getX() > p2.getX()) {
    			return 0;
    		}
    		else {
    			return -1;
    		}
    	}
    	else {
    		if(p1.getY() > p2.getY()) {
    			return 1;
    		}
    		else if(p1.getY() == p2.getY()) {
    			return 0;
    		}
    		else {
    			return -1;
    		}
    	}
    }
}
