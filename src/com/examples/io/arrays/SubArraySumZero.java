package com.examples.io.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class SubArraySumZero {

    public static void main(String[] args) {
        SubArraySumZero arraySumZero = new SubArraySumZero();
        //int [] array = {1,2,-5,-1,2,-1};
        int [] array = {1,2,3,4,5,-15,20};
        //int [] array = {1,2,3,4,5};
        int range [] = arraySumZero.subArray0(array);
        Arrays.stream(range).forEach(System.out::print);
        System.out.println();
    }

    public int [] subArray0(int array[]) {

        HashMap<Integer, Integer> sums = new HashMap<>();

        int sum = 0;

        for (int i = 0; i <= array.length; i++) {
            Integer oldIndex = sums.get(sum);

          if(oldIndex == null && i == array.length) {
                return new int[] {-1,-1};
            }
            else if (oldIndex == null) {
                sums.put(sum, i);
               System.out.println("Sum map " + sums);
                sum = sum + array[i];
              System.out.println("Sum is " + sum);
            } else {
              System.out.println("oldIndex " + oldIndex) ;
                return Arrays.copyOfRange(array, oldIndex, i);
            }
        }
    return new int[] {-1,-1};
    }
}
