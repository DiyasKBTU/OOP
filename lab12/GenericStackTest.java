package lab12;

public class GenericStackTest {
	public static void main(String[] args) {
		GenericStack<Integer> st = new GenericStack<>();
		for(int i = 2; i <= 50; i++) {
			boolean b = true;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					b = false;
					break;
				}
			}
			if(b) {
				st.push(i);
			}
		}
		System.out.println(st.toString());
	}
}
