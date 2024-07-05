package lab12;

import java.util.*;

public class PriorityQueue<E extends Comparable<E>> {
    List<E> queue;
    Comparator<? super E> comparator;

    public PriorityQueue() {
        queue = new ArrayList<>();
        comparator = null;
    }

    public PriorityQueue(Comparator<? super E> comparator) {
        queue = new ArrayList<>();
        this.comparator = comparator;
    }

    public void enqueue(E newObject) {
        int i = 0;
        for (; i < queue.size(); i++) {
            if (compare(newObject, queue.get(i)) < 0) {
                break;
            }
        }
        queue.add(i, newObject);
    }

    public E dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.remove(0);
    }

    public int getSize() {
        return queue.size();
    }
    
    private int compare(E a, E b) {
        if (comparator != null) {
            return comparator.compare(a, b);
        } else {
            return a.compareTo(b);
        }
    }
}
