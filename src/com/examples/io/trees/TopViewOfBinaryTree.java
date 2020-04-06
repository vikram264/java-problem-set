package com.examples.io.trees;

import java.util.*;

public class TopViewOfBinaryTree {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.left.right = new Node(8);
        root.right.right.right = new Node(9);
        root.right.right.left = new Node(10);
        root.right.right.left.right = new Node(11);
        root.right.right.left.right.right = new Node(12);
        TopViewOfBinaryTree topViewOfBinaryTree = new TopViewOfBinaryTree();
        topViewOfBinaryTree.topViewOfBinaryTree(root);
    }

    public void topViewOfBinaryTree(Node root) {

        if(root == null) {
            return;
        }

        List <Integer> topView = new ArrayList<>();
        List <Integer> bottomView = new ArrayList<>();
        Queue<HDNode> queue = new LinkedList<>();
        queue.offer(new HDNode(0,root));
        Map<Integer, List<Integer>> map = new TreeMap<>();

        while(!queue.isEmpty()) {

            HDNode currentNode = queue.remove();
            map.putIfAbsent(currentNode.hd,new ArrayList<>());
            map.get(currentNode.hd).add(currentNode.node.data);

            if(currentNode.node.left!=null) queue.add(new HDNode(currentNode.hd-1,currentNode.node.left));
            if(currentNode.node.right!=null) queue.add(new HDNode(currentNode.hd+1,currentNode.node.right));

        }


        for(Integer key:map.keySet()) {
            topView.add(map.get(key).get(0));
        }

        System.out.println("Top view " +topView.toString());


        for(Integer key:map.keySet()) {
            int size = map.get(key).size();
            bottomView.add(map.get(key).get(size-1));
        }
        System.out.println("Bottom view " +bottomView.toString());
    }

}
