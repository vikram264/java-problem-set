package com.examples.io.linkedlists;

public class ReverseLinkedListMtoNPlaces {

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.printNode(node);
        ReverseLinkedListMtoNPlaces reverse = new ReverseLinkedListMtoNPlaces();
        Node reverseNode = reverse.reverseMtoNPlaces(node,2,4);
        System.out.println();
        node.printNode(reverseNode);
    }


    public Node reverseMtoNPlaces (Node head,int m,int n) {

        Node prev = null;
        Node current = head;
        while (m>1) {
            prev = current;
            current = current.next;
            m--;
            n--;
        }
        //1->2->3->4->5
        Node connection = prev; // This will have 1 and will be needed to connect to 4
        Node tail = current; // This will have 2 and will be needed to connect to 5.
        while(n>0) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            n--;
        }

        if(connection!=null) {
            connection.next = prev;
        } else {
            head = prev;
        }

        tail.next = current;
        return head;





    }
}
