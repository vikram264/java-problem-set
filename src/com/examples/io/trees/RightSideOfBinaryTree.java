package com.examples.io.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideOfBinaryTree {


    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(5);
        node.right = new Node(15);
        node.left.left = new Node(4);
        node.left.right = new Node(6);
        node.right.right = new Node(16);
        node.right.left = new Node(14);

        RightSideOfBinaryTree rightSideOfBinaryTree = new RightSideOfBinaryTree();
        rightSideOfBinaryTree.rightSideOfBinaryTree(node);

    }


    public List<Integer> rightSideOfBinaryTree(Node root) {
       List<Integer> result = new ArrayList<>();

        if(root == null) {
            return  result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        List<Integer> currentLevel = new ArrayList<>();
        while(!queue.isEmpty()) {

            Node currentNode = queue.remove();

            if(currentNode == null) {
                result.add(currentLevel.get(currentLevel.size()-1));

                if(queue.isEmpty()) {
                    break;
                }

                queue.add(null);
                currentLevel = new ArrayList<>();
                continue;
            }

            currentLevel.add(currentNode.data);

            if(currentNode.left!=null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right!=null) {
                queue.add(currentNode.right);
            }
        }

        for(int i = 0;i<result.size();i++) {
            System.out.println("Right Side " + result.get(i));
        }

        return result;
    }
}
