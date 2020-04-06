package com.examples.io.linkedlists;

public class CycleorLoopInLinkedList {


    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = node.next.next;
        System.out.println(new CycleorLoopInLinkedList().hasLoop(node));
        System.out.println(new CycleorLoopInLinkedList().startOfTheLoop(node));

    }

    public boolean hasLoop(Node head) {
        Node current = head;
        Node slow  = current;
        Node fast = current.next;


        while(slow!=fast) {

            if(fast == null ||fast.next==null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }


      System.out.println("Start of the loop is "+startOfTheLoop(head).data);
        return true;

    }


    public Node startOfTheLoop(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow =slow.next;

            if(slow==fast) {
                slow = head;
                while(slow!=fast) {
                    fast = fast.next;
                    slow=slow.next;
                }
                return fast;
            }
        }
        return fast;
    }



}
