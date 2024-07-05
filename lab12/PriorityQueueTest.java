package lab12;

import java.util.Comparator;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq1 = new PriorityQueue<>();
		pq1.enqueue(5);
		pq1.enqueue(1);
		pq1.enqueue(3);
		pq1.enqueue(2);
		pq1.enqueue(4);
		System.out.println("Priority Queue without comparator:");
        while (pq1.getSize() != 0) {
            System.out.println(pq1.dequeue());
        }
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(new ReverseCom());
        pq2.enqueue(5);
        pq2.enqueue(1);
        pq2.enqueue(3);
        pq2.enqueue(2);
        pq2.enqueue(4);

        System.out.println("Priority Queue with custom comparator (reverse order):");
        while (pq2.getSize() != 0) {
            System.out.println(pq2.dequeue());
        }


	}

}
