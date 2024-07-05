package lab11;

import java.util.Arrays;
import java.util.Random;

public class T5 {
	
	
	public static void main(String[] args) {
		Point[] points = new Point[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(100); 
            int y = random.nextInt(100);
            points[i] = new Point(x, y);
        }

        Arrays.sort(points);

        for (Point point : points) {
            System.out.println(point);
        }

        Arrays.sort(points, new CompareY());

        for (Point point : points) {
            System.out.println(point);
        }
	}

}
