package com.examples.io.heaps;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(7);

        Node head3 = new Node(6);
        head3.next = new Node(8);
        head3.next.next = new Node(9);


        List<Node> nodes = new ArrayList<>();
        nodes.add(head1);
        nodes.add(head2);
        nodes.add(head3);


        MergeKSortedLists mergeKSortedLists = new MergeKSortedLists();
        Node node = mergeKSortedLists.mergeKSortedLists(nodes);

        node.printNode(node);

    }


    public Node mergeKSortedLists(List<Node> lists) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (Node head : lists) {
            while (head != null) {
                priorityQueue.add(head.data);
                head = head.next;
            }
        }

        Node dummy = new Node(-1);
        Node head = dummy;

        System.out.println("size " + priorityQueue.size());
        while (!priorityQueue.isEmpty()) {
            head.next = new Node(priorityQueue.poll());
            head = head.next;
        }
        return dummy.next;


    }


}


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }


    public void printNode(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
}
