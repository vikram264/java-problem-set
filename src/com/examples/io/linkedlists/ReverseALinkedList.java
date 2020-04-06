package com.examples.io.linkedlists;



public class ReverseALinkedList {

    public static void main(String[] args) {

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.printNode(node);
        ReverseALinkedList reverseALinkedList = new ReverseALinkedList();
        Node reversedNode = reverseALinkedList.reverseALinkedList(node);
        System.out.println();
        node.printNode(reversedNode);

    }


    public  Node reverseALinkedList(Node current) {
        Node prev = null;

        while(current!=null) {
            Node next = current.next;
            current.next = prev;
            prev=current;
            current = next;
        }
        return prev;
    }



}
