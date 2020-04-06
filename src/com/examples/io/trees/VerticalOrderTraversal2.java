package com.examples.io.trees;

import java.util.*;

public class VerticalOrderTraversal2 {

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

        VerticalOrderTraversal2 verticalOrderTraversal2 = new VerticalOrderTraversal2();
        verticalOrderTraversal2.verticalOrderTraversal2(root);
    }

    public void verticalOrderTraversal2(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return;
        }
        Queue<HDNode> queue = new LinkedList<>();
        queue.offer(new HDNode(0,root));
        Map<Integer,List<Integer>> map = new TreeMap<>();

        while(!queue.isEmpty()) {
            HDNode currentHdNode = queue.poll();
            map.putIfAbsent(currentHdNode.hd,new ArrayList<>());

            map.get(currentHdNode.hd).add(currentHdNode.node.data);
            
            if(currentHdNode.node.left!=null) {
                queue.offer(new HDNode(currentHdNode.hd-1,currentHdNode.node.left));
            }
            if(currentHdNode.node.right!=null) {
                queue.offer(new HDNode(currentHdNode.hd+1,currentHdNode.node.right));
            }
        }
        for(Integer key : map.keySet()) {
            result.add(map.get(key));
        }

        System.out.println(result);

    }
}

class HDNode {

    int hd;
    Node node;

    public HDNode( int hd,Node node) {
        this.node = node;
        this.hd = hd;
    }
}


