package lab11;

import java.util.Comparator;

class CompareY implements Comparator<Point> {
    public int compare(Point p1, Point p2) {
        if (p1.getY() == p2.getY()) {
            return Integer.compare(p1.getX(), p2.getX());
        }
        return Integer.compare(p1.getY(), p2.getY());
    }
}
