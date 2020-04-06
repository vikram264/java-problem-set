package com.examples.io.linkedlists;

public class RemoveDuplicatesSortedLinkedList {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(2);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(3);
        RemoveDuplicatesSortedLinkedList deDup = new RemoveDuplicatesSortedLinkedList();
        Node deDupSorted = deDup.removeDuplicatesSortedList(node);
        node.printNode(deDupSorted);
    }


    public Node removeDuplicatesSortedList(Node head) {
        Node current = head;
        while(current!=null && current.next!=null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
