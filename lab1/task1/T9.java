package task1;
import java.util.Scanner;
public class T9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int sum = 0;
		while(a != 0) {
			sum += a % 10;
			a = a / 10;
		}
		System.out.println(sum);

	}

}
