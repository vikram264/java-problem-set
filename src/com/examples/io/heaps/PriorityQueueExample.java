package com.examples.io.heaps;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(20);
        pq.add(2);
        pq.add(100);
        pq.add(10);

       // System.out.println(pq.peek());

        System.out.println(pq.poll());
        System.out.println(pq.element());

        System.out.println(pq.poll());
        System.out.println(pq.element());

        System.out.println(pq.poll());
        System.out.println(pq.element());

        System.out.println(pq.poll());
        System.out.println(pq.element());

        System.out.println(pq.poll());
        System.out.println(pq.element());




    }
}
