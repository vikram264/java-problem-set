package com.examples.io.trees;

import java.util.Stack;

public class IsValidBST {

    public static void main(String[] args) {
        Node node = new Node(2);
        node.left = new Node(1);
        node.right = new Node(3);
        IsValidBST isValidBST = new IsValidBST();
        System.out.println(isValidBST.isValidBST(node));
    }

    public boolean isValidBST(Node root) {

        Stack<Node> stack = new Stack<>();
        double left_child = -Double.MAX_VALUE;

        while(!stack.isEmpty() || root!=null) {

            while(root!=null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            if(root.data <= left_child) return false;
            left_child = root.data;
            root = root.right;

        }


        return true;
    }
}
