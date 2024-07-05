package lab11;

public class T2 {
	public static <E extends Comparable<E>> E max(E[] list) {
		if(list == null || list.length == 0) {
			return null;
		}
		E max = list[0];
		for(int i = 1; i < list.length; i++) {
			if(list[i].compareTo(max) > 0) {
				max = list[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
