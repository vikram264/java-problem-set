package com.examples.io.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestFromTheStream {


    public static void main(String[] args) {
        int [] nums = {4,18,45,97,3,70};
        int k = 5;
        KthLargestFromTheStream kthLargestFromTheStream = new KthLargestFromTheStream(k,nums);
        int val = kthLargestFromTheStream.add(43);
        System.out.println("value is " +val);
    }



    Queue<Integer> q;
    int k;

    KthLargestFromTheStream(int k,int [] nums) {
       q = new PriorityQueue<>();
       this.k = k;
       for(int i:nums) add(i);

    }

    public int add(int i) {
        q.add(i);
        if(q.size()>k) {
            q.poll();
        }
        return q.peek();

    }
}
