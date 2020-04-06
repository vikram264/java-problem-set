package com.examples.io.arrays;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static void main(String[] args) {
        int [] nums = {6,9,2,1,10};
        System.out.println(new KthLargestElement().findKthLargest(nums,2));
    }

    public Integer findKthLargest(int [] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for(int i = 0;i<nums.length;i++) {
            priorityQueue.add(nums[i]);
            System.out.println("Size " + priorityQueue.size());
            if(priorityQueue.size()>k) {
                priorityQueue.remove();
            }
        }
        return priorityQueue.remove();
    }
}
