package com.examples.io.arrays;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesSortedArray removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
        int [] nums = {1,1,2,2,2,3,3,4,5,5};
        removeDuplicatesSortedArray.removeDuplicates(nums);

    }

    public void removeDuplicates(int[] arr) {
        int len = arr.length;
        int j = 0;
        for(int i = 0 ; i < len-1;i++) {
            if(arr[i]!=arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[len-1];
        for(int k =0;k<j;k++) {
            System.out.println(arr[k]);
        }
    }
}
