package lab2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter of first circle's data:");
		int xCoordinate1 = input.nextInt();
		int yCoordinate1 = input.nextInt();
		int radius1 = input.nextInt();
		
		System.out.println("Enter of second circle's data:");
		int xCoordinate2 = input.nextInt();
		int yCoordinate2 = input.nextInt();
		int radius2 = input.nextInt();
		
		Circle myCircle = new Circle(xCoordinate1, yCoordinate1, radius1);
		Circle anotherCircle = new Circle(xCoordinate2, yCoordinate2, radius2);
		
		System.out.println(myCircle);
		System.out.println("Area of the circle: " + myCircle.getArea());
		System.out.println("Circumference of the circle: " + myCircle.getCircumference());
		
		System.out.println(anotherCircle);
		System.out.println("Area of the circle: " + anotherCircle.getArea());
		System.out.println("Circumference of the circle: " + anotherCircle.getCircumference());
		
		System.out.println("Distance between centers of two circles: " + myCircle.getDistanceTo(anotherCircle));
	}

}
