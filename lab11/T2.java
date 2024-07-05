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
		Integer[] arr = {5, 2, 1, 3, 6, 4};
		
		int max = max(arr);
		System.out.println(max);
	}

}
