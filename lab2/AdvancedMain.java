package lab2;
import java.util.Scanner;
public class AdvancedMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * int x1 = input.nextInt(); int y1 = input.nextInt(); int r1 = input.nextInt();
		 * 
		 * int x2 = input.nextInt(); int y2 = input.nextInt(); int r2 = input.nextInt();
		 * Point p1 = new Point(x1, y1); Point p2 = new Point(x2, y2);
		 * 
		 * AdvancedCircle c1 = new AdvancedCircle(p1, r1); AdvancedCircle c2 = new
		 * AdvancedCircle(p2, r2);
		 * 
		 * System.out.println(c1.getDistanceTo(c2));
		 */
		System.out.println("Enter of first rectangle's data:");
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		System.out.println("Enter of second rectangle's data:");
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		int x4 = input.nextInt();
		int y4 = input.nextInt();
		Point topLeft1 = new Point(x1, y1);
		Point bottomRight1 = new Point(x2, y2);
		Point topLeft2 = new Point(x3, y3);
		Point bottomRight2 = new Point(x4, y4);
		AdvancedRectangle r1 = new AdvancedRectangle(topLeft1, bottomRight1);
		AdvancedRectangle r2 = new AdvancedRectangle(topLeft2, bottomRight2);
		
		System.out.println(r1);
		System.out.println("Area of the rectangle1: " + r1.getArea());
		System.out.println("Perimeter of the rectangle1: " + r1.getPerimeter());
		System.out.println(r2);
		System.out.println("Area of the rectangle2: " + r2.getArea());
		System.out.println("Perimeter of the rectangle2: " + r2.getPerimeter());
		System.out.println("Distance of these rectangles: " + r1.getDistanceToTheCenterOf(r2));
	}
	

}
