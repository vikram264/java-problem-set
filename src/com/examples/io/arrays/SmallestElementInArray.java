package com.examples.io.arrays;

public class SmallestElementInArray {

    public static void main(String[] args) {
        SmallestElementInArray smallest = new SmallestElementInArray();
        System.out.println(smallest.findSmallest(new int[]{10,20,1,17,12}));
    }
    public int findSmallest(int nums[]) {
        int i =0;
        int min = nums[0];

        for(i=1;i<nums.length;i++) {
            if(nums[i]<min) {
                min = nums[i];
            }
        }
        return min;
    }
}
