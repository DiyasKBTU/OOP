package lab11;
import java.util.*;

public class T6 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            l.add(i);
        }

        long startTime = System.nanoTime();

        Iterator<Integer> iterator = l.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        long endTime = System.nanoTime();
        long iteratorTime = endTime - startTime;
        System.out.println("By iterator: " + iteratorTime + " nanoseconds");
        startTime = System.nanoTime();

        for (int i = 0; i < l.size(); i++) {
            l.get(i);
        }

        endTime = System.nanoTime();
        long getIndexTime = endTime - startTime;
        System.out.println("By index: " + getIndexTime + " nanoseconds");
    }
}
