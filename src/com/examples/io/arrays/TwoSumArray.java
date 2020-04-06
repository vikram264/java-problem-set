package com.examples.io.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumArray {

    public static void main(String[] args) {
        int arr[] = {2,5,7,11,6};
        TwoSumArray twosum = new TwoSumArray();
        int[] res = twosum.findTwoSum(arr,9);
        Arrays.stream(res).forEach(System.out::println);
    }


    public int[] findTwoSum(int[] arr, int target) {

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int reminder = target - arr[i];
            if(map.containsKey(reminder)) {
                System.out.println(reminder + " " + arr[i]);
                return new int[] {reminder,arr[i]};
            }
                map.put(arr[i],i);
        }
        throw new IllegalArgumentException("pair not found");
        //System.out.println("pair not found");
    }
}
