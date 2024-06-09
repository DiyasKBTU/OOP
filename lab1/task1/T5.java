package task1;
import java.util.Scanner;
public class T5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int a = input.nextInt();
			if(a == 0) {
				break;
			}
			
			if(a % 2 == 1) {
				sum += a;
			}
			
		}
		
		System.out.println(sum);

	}

}
