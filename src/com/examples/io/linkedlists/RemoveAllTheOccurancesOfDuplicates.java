package com.examples.io.linkedlists;

public class RemoveAllTheOccurancesOfDuplicates {


    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(1);
        node.next.next = new Node(1);
        node.next.next.next = new Node(2);
        node.next.next.next.next = new Node(3);

        RemoveAllTheOccurancesOfDuplicates removeAllTheOccurancesOfDuplicates = new RemoveAllTheOccurancesOfDuplicates();
        Node dup = removeAllTheOccurancesOfDuplicates.removeAllDuplicates(node);
        node.printNode(dup);

    }
    public Node removeAllDuplicates(Node head) {
        Node temp = new Node(0);
        temp.next = head;

        Node current = temp;
        while(current.next!=null&&current.next.next!=null){
            System.out.println("Entering while " + current.next.data);
            if(current.next.data == current.next.next.data){
                int dup = current.next.data;
                while(current.next!=null&&current.next.data==dup){
                    System.out.println("data " + current.next.data);
                    current.next = current.next.next;
                }
            }else{
                current=current.next;
            }

        }

        return temp.next;
}}
