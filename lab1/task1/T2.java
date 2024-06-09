package task1;
import java.util.Scanner;
public class T2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = a / 100000 + ((a / 10000)%10) + ((a / 1000) % 10) ;
		int c = ((a / 100) % 10) + ((a / 10) % 10) + a % 10;
		if(b == c) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
