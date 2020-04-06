package com.examples.io.arrays;

public class MaximumElementInAnArray {

    public static void main(String[] args) {
        MaximumElementInAnArray max = new MaximumElementInAnArray();
        System.out.println(max.findMax( new int[]{5,19,12,16,8}));
    }
    public int findMax(int[] nums) {
        int i,max = 0 ;
        for(i=0;i<nums.length;i++) {
            if(nums[i]>max) {
                max = nums[i];
            }
        }
        return max;
    }
}
