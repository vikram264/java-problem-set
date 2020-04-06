package com.examples.io.trees;

public class Node {
    Node left,right;
    int data;

    Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if(value <=data) {
            if(left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if(right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public  boolean contains(int value) {
        if(value==data) {
            return true;
        }
        if(value <=data) {
            if(left == null) {
                return false;

            } else {
                return left.contains(value);
            }
        } else {
            if(right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    /**
     * Inorder LE-RO-RI
     * preoder - RO-LE-RI
     * Postorder LE-RI-RO
     */

    public void printInorder() {
        if(left!=null) {
            left.printInorder();
        }
        System.out.println(data);
        if(right!=null) {
            right.printInorder();
        }
    }

    public void printPreorder() {
        System.out.println(data);
        if(left!=null) {
            left.printPreorder();
        }
        if(right!=null) {
            right.printPreorder();
        }
    }

    public void printPostorder() {

        if(left!=null) {
            left.printPostorder();
        }
        if(right!=null) {
            right.printPostorder();
        }
        System.out.println(data);
    }
}
