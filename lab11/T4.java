package lab11;

import java.util.ArrayList;
import java.util.HashSet;

public class T4 {
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list){
		HashSet<E> set = new HashSet<>(list);
		return new ArrayList<>(set);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(List.of(1, 1, 2, 3, 3, 4, 4, 5));
		ArrayList<Integer> removed = new ArrayList<>();
		removed = removeDuplicates(arr);
		System.out.println(removed);

	}

}
