package com.examples.io.trees;

import java.util.*;

public class VerticalOrderTraversal {

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

        VerticalOrderTraversal verticalOrderTraversal = new VerticalOrderTraversal();
        //verticalOrderTraversal.verticalOrderTraversal(root);
    }

    /*public void verticalOrderTraversal(Node root) {
        if(root == null) {
            return;
        }

        Map<Integer, List<Node>> sortedMap = new TreeMap<>();
        Queue<HDNode> queue = new LinkedList<>();
        queue.add(new HDNode(0,root));
        List<Node> sameDistanceNodes = new ArrayList<>();
        sameDistanceNodes.add(root);
        while(!queue.isEmpty()) {

            HDNode currentNode = queue.remove();

            if(sortedMap.containsKey(currentNode.hd)) {
                sameDistanceNodes = sortedMap.get(currentNode.hd);
                sameDistanceNodes.add(currentNode.node);
                sortedMap.put(currentNode.hd,sameDistanceNodes);


            } else {
                List<Node> list = new ArrayList<>();
                list.add(currentNode.node);
                sortedMap.put(currentNode.hd,list);
            }
            if(currentNode.node.left!=null) {
                queue.add(new HDNode(currentNode.hd-1,currentNode.node.left));
            }

            if(currentNode.node.right!=null) {
                queue.add(new HDNode(currentNode.hd+1,currentNode.node.right));
            }
        }
        System.out.println(sortedMap.keySet());
        System.out.println(sortedMap.get(-2));
        System.out.println(sortedMap.get(-1));
        System.out.println(sortedMap.get(0));
        System.out.println(sortedMap.get(1));
        System.out.println(sortedMap.get(2));
        System.out.println(sortedMap.get(3));


        *//*List<List<Integer>> list = new ArrayList<>();
        for(Integer key : sortedMap.keySet()) {
            List<Node> nodeList = sortedMap.get(key);
            List<Integer> orderList =  new ArrayList<>();
            for(Node node:nodeList) {
                //System.out.print("key=" + key + " and value="+ node.data + " ");
                orderList.add(node.data);
            }
            list.add(orderList);
            //System.out.println();
        }

        System.out.println(list);*//*


    }*/

}


 /*class HDNode {

    int hd;
    Node node;

     public HDNode( int hd,Node node) {
         this.node = node;
         this.hd = hd;
     }
 }*/
