package com.examples.io.linkedlists;

public class PrintTheNthValueFromEnd {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);

        PrintTheNthValueFromEnd printTheNthValueFromEnd = new PrintTheNthValueFromEnd();
        int x = printTheNthValueFromEnd.printNthNodeFromEnd(node,3);
        System.out.println("Value of x "+x);
    }

    public int printNthNodeFromEnd(Node head, int x) {
        //Node current = head;

        Node fast = head;
        Node follower = head;

        for(int i = 1;i<=x;i++) {
            fast = fast.next;
        }

        while(fast!=null) {
                fast = fast.next;
                follower = follower.next;

        }
        return follower.data;
    }
}
