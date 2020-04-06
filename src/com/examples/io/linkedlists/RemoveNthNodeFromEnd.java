package com.examples.io.linkedlists;

public class RemoveNthNodeFromEnd {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        RemoveNthNodeFromEnd removeNthNodeFromEnd = new RemoveNthNodeFromEnd();
        Node current = removeNthNodeFromEnd.removeNthNodeFromEnd(node,2);
        node.printNode(current);

    }
    public Node removeNthNodeFromEnd(Node head, int x) {
        Node current = head;

        Node slow = head;
        Node fast = head;

        for(int i = 1;i<=x+1;i++) {
            fast = fast.next;
        }

        while (fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return current;

    }
}
