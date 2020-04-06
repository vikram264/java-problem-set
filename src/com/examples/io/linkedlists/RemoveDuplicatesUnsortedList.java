package com.examples.io.linkedlists;

import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicatesUnsortedList {


    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(1);
        node.next.next.next.next = new Node(2);
        RemoveDuplicatesUnsortedList removeDup = new RemoveDuplicatesUnsortedList();
        Node deDup = removeDup.deDupUnsortedLinkedList(node);
        node.printNode(deDup);

    }
        public Node deDupUnsortedLinkedList(Node head) {

            Node current = head;

            HashSet<Integer> set = new HashSet<>();
            set.add(current.data);

            while(current.next!=null) {
                if(set.contains(current.next.data)) {
                    current.next = current.next.next;
                } else {
                    set.add(current.next.data);
                    current = current.next;
                }
            }

            return head;

        }
}
