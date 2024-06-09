package task1;
import java.util.Scanner;
public class T8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		double sum = 0;
		int c = 2;
		for(double i = 1; i <= n; i+=2) {
			if(c % 2 == 1) {
				sum += -1/i;
			}
			else {
				sum += 1/i;
			}
			c++;
		}
		
		System.out.println(sum);

	}

}
