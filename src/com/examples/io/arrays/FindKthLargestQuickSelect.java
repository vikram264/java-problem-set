package com.examples.io.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindKthLargestQuickSelect {

    public static void main(String[] args) {
        int [] nums = {3,2,1,5,6,4,7};
        //int [] nums = {3,2,1,4};
        FindKthLargestQuickSelect findKthLargestQuickSelect = new FindKthLargestQuickSelect();
        System.out.println(findKthLargestQuickSelect.findKthLargest(nums,6));
    }
    public int findKthLargest(int[] nums, int k) {

         k = nums.length - k;
    int low = 0;
    int high = nums.length - 1;
        while(low < high){
        int returnedIndex = partition(nums, low, high);
        if(returnedIndex == k){
            return nums[k];
        }else if(returnedIndex < k){
            low = returnedIndex + 1;
        }else{
            high = returnedIndex - 1;
        }
    }
        return nums[k];
}

    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low;
        for (int j = low; j < high ; j++) {
            System.out.println("comparing" + arr[j] +" and " + pivot);
            if (arr[j] <= pivot) {
                System.out.println("swap "+ arr[i] + " " + arr[j]);
              swap(arr, i, j);
                i++;
                System.out.println("i value :" + i);
            }
        }
        swap(arr, i, high);
        return i;
    }

    private void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;



    }
}
