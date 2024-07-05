package lab11;

import java.util.ArrayList;
import java.util.List;

public class T3 {
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		if (list == null || list.isEmpty()) {
            		return null;
        }
        
        E max = list.get(0);
        for (E element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
             return max;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(List.of(5, 2, 1, 3, 6, 4));
		
		int max = max(arr);
		System.out.println(max);

	}

}
