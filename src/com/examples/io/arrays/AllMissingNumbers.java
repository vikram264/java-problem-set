package com.examples.io.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumbers {

    public static void main(String[] args) {
//[4,3,2,7,8,2,3,1]
        int array[] = {4,3,5,7,8,2,3,1};
        AllMissingNumbers allMissingNumbers = new AllMissingNumbers();
       // System.out.println(allMissingNumbers.findDisappearedNumbers(array));
        allMissingNumbers.findDisappearedNumbers2(array);
    }


    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // nums[n - 1] = n;  //can not do this, since you will override the origin node.
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0) nums[idx] = - nums[idx];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) res.add(i + 1);
        }
        return res;

    }

    public void findDisappearedNumbers2(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // nums[n - 1] = n;  //can not do this, since you will override the origin node.
            int idx = Math.abs(nums[i]) - 1;
            if (nums[idx] < 0) {
               //res.add(idx+1);
            } else {
                nums[idx] = - nums[idx];
            }


        }


        //System.out.println(res);
        Arrays.stream(nums).forEach(System.out::println);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) res.add(i + 1);
        }
        System.out.println();
       System.out.println(res);
        //return res;

    }

}
