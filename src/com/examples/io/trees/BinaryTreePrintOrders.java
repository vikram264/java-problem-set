package com.examples.io.trees;

public class BinaryTreePrintOrders {

    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(5);
        node.right = new Node(15);
        node.left.left = new Node(4);
        node.left.right = new Node(6);
        node.right.right = new Node(16);
        node.right.left = new Node(14);

        node.printInorder();
        System.out.println();
        node.printPreorder();
        System.out.println();
        node.printPostorder();
        System.out.println();
    }


}
