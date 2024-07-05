package lab11;

public class T1 {
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for(int i = 0; i < list.length; i++) {
			if(list[i].compareTo(key) == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"apple", "banana", "cherry"};

        int intIndex = linearSearch(intArray, 3);
        System.out.println("Index of 3 in intArray: " + intIndex);
        int strIndex = linearSearch(strArray, "banana");
        System.out.println("Index of 'banana' in strArray: " + strIndex);

	}

}
