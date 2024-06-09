package task1;
import java.util.Scanner;
public class T6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		double sum = 0;
		for(double i = 1; i <= n; i++) {
			sum += 1/i; 
		}
		
		System.out.println(sum);

	}

}
