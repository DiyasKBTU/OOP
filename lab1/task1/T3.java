package task1;
import java.util.Scanner;
public class T3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, t1, t2;
		a = input.nextInt();
		t1 = input.nextInt();
		t2 = input.nextInt();
		double v1, v2;
		v1 = 20 / t1;
		v2 = (a - 20) / t2;
		if(v1 > v2) {
			System.out.println("Before");
		}
		else if(v1 == v2 ) {
			System.out.println("Equal");
		}
		else {
			System.out.println("After");
		}

	}

}
