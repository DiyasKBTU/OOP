package task1;
import java.util.Scanner;
public class T7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		double m = input.nextDouble();
		
		for(double i = n; i <= m; i += 0.5) {
			double y = -2.4*i*i + 5*i - 3;
			System.out.printf("%.1f %.1f%n", i, y);
		}

	}

}
