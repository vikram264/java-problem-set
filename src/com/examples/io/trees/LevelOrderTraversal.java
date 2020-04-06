package com.examples.io.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    //https://leetcode.com/problems/binary-tree-level-order-traversal/

    public static void main(String[] args) {
        Node node = new Node(10);
        node.left = new Node(5);

        node.right = new Node(15);
        node.left.left = new Node(4);
        node.left.right = new Node(6);
        node.right.right = new Node(16);
        node.right.left = new Node(14);

        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.printLevelByLevelApproach2(node).forEach(list-> {
            System.out.println(list);
        });
    }

    public List<List<Integer>> printLevelByLevel(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        List<List<Integer>> results = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                currentLevel.add(node.data);
                if(node.left!=null) {
                    queue.add(node.left);
                }

                if(node.right!=null) {
                    queue.add(node.right);
                }


            }
            results.add(currentLevel);

        }

        return results;

    }


    public List<List<Integer>> printLevelByLevelApproach2(Node node) {
        List<List<Integer>> allLevels = new ArrayList<>();
        if(node == null) {
            return allLevels;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        List<Integer> currentLevel = new ArrayList<>();
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();

            if(currentNode == null) {
                allLevels.add(currentLevel);
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
        return allLevels;
    }
}
