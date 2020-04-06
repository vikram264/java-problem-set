package com.examples.io.linkedlists;

import java.util.LinkedList;

public class Node {
     int data;
     Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }


    public void printNode(Node head) {
        while(head!=null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
}
