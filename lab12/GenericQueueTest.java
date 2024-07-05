package lab12;

public class GenericQueueTest {

	public static void main(String[] args) {
		GenericQueue<Integer> st = new GenericQueue<>();
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
