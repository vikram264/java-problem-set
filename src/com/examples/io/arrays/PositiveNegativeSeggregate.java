package com.examples.io.arrays;

import java.util.Arrays;

public class PositiveNegativeSeggregate {

    public static void main(String[] args) {
        int [] arr = {-2,-7 , 9,8,-1};
        PositiveNegativeSeggregate positiveNegativeSeggregate = new PositiveNegativeSeggregate();
        positiveNegativeSeggregate.seggregate(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
    public void seggregate(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(true) {
            while (arr[i] < 0 && i<j) {
                i++;

            }

            while (arr[j] > 0&&i<j) {
                j--;
            }
            if (i < j) {
               // swap(arr[i], arr[j]);
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            } else {
                break;
            }
        }
    }


    public void swap(int x, int y) {

        x = x + y;
        y = x - y;
        x = x - y;

    }
}
