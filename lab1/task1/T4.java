package task1;
import java.util.Scanner;
public class T4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = input.nextDouble();
		if(y == 5*x*x - 7*x+2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
