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
		Integer[] arr = {1, 2, 3, 4, 5};

        	int key = linearSearch(arr, 5);
        	if(key == -1) {
        		System.out.println("This is not exist!");
        	}
        	else {
        		System.out.println(key);
        	}
        	
        	
	}

}
