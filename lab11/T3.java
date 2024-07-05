package lab11;

import java.util.ArrayList;

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
		// TODO Auto-generated method stub

	}

}
