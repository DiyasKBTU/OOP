package lab12;

import java.util.LinkedList;

public class GenericQueue<E> extends LinkedList<E> {
	public void enqueue(E e) {
		super.addLast(e);
	}
	public E dequeue() {
		return super.removeFirst();
	}
	public int getSize() {
		return super.size();
	}
	public String toString() {
		return "Queue: " + super.toString();
	}
}
