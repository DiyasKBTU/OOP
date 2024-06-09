package task1;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		if(a == b) {
			System.out.println("Two numbers are equal");
		}
		else if(a > b) {
			System.out.println(a + " is greater than " + b);
		}
		else {
			System.out.println(a + " is less than " + b);
		}
		
		
	}

}
