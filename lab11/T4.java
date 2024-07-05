package lab11;

import java.util.ArrayList;
import java.util.HashSet;

public class T4 {
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		HashSet<E> set = new HashSet<>(list);
		return new ArrayList<>(set);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
