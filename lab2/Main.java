package lab2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * System.out.println("Enter of first circle's data:"); int xCoordinate1 =
		 * input.nextInt(); int yCoordinate1 = input.nextInt(); int radius1 =
		 * input.nextInt();
		 * 
		 * System.out.println("Enter of second circle's data:"); int xCoordinate2 =
		 * input.nextInt(); int yCoordinate2 = input.nextInt(); int radius2 =
		 * input.nextInt();
		 * 
		 * Circle myCircle = new Circle(xCoordinate1, yCoordinate1, radius1); Circle
		 * anotherCircle = new Circle(xCoordinate2, yCoordinate2, radius2);
		 * 
		 * System.out.println(myCircle); System.out.println("Area of the circle: " +
		 * myCircle.getArea()); System.out.println("Circumference of the circle: " +
		 * myCircle.getCircumference());
		 * 
		 * System.out.println(anotherCircle); System.out.println("Area of the circle: "
		 * + anotherCircle.getArea());
		 * System.out.println("Circumference of the circle: " +
		 * anotherCircle.getCircumference());
		 * 
		 * System.out.println("Distance between centers of two circles: " +
		 * myCircle.getDistanceTo(anotherCircle));
		 */
		
		System.out.println("Enter of first rectangle's data:");
		int r1x1 = input.nextInt();
		int r1y1 = input.nextInt();
		int r1x2 = input.nextInt();
		int r1y2 = input.nextInt();
		
		System.out.println("Enter of second rectangle's data:");
		int r2x1 = input.nextInt();
		int r2y1 = input.nextInt();
		int r2x2 = input.nextInt();
		int r2y2 = input.nextInt();
		Rectangle myRectangle = new Rectangle(r1x1, r1y1, r1x2, r1y2);
		Rectangle anotherRectangle = new Rectangle(r2x1, r2y1, r2x2, r2y2);
		
		System.out.println(myRectangle);
		System.out.println("Area of the rectangle1: " + myRectangle.getArea());
		System.out.println("Perimeter of the rectangle1: " + myRectangle.getPerimeter());
		System.out.println(anotherRectangle);
		System.out.println("Area of the rectangle2: " + anotherRectangle.getArea());
		System.out.println("Perimeter of the rectangle2: " + anotherRectangle.getPerimeter());
		System.out.println("Distance of these rectangles: " + myRectangle.getDistanceToTheCenterOf(anotherRectangle));
	}

}
