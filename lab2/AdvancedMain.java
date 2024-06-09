package lab2;
import java.util.Scanner;
public class AdvancedMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int r1 = input.nextInt();
		
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int r2 = input.nextInt();
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		
		AdvancedCircle c1 = new AdvancedCircle(p1, r1);
		AdvancedCircle c2 = new AdvancedCircle(p2, r2);
		
		System.out.println(c1.getDistanceTo(c2));
	}

}
