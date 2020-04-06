package com.examples.io.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {


    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6,8};
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int res[] = mergeTwoSortedArrays.mergeSortedArrays(arr1,arr2);

        Arrays.stream(res).forEach(System.out::println);
    }

    public int[] mergeSortedArrays(int[] arr1, int[] arr2) {

        int s1 = arr1.length;
        int s2 = arr2.length;
        int[] res = new int[s1 + s2];
        int i = 0, j = 0, k = 0;

        while (i < s1 && j < s2) {
            if (arr1[i] < arr2[j]) {
                res[k++] = arr1[i];
                i++;
            } else {
                res[k++] = arr2[j];
                j++;
            }
        }

        while (i < s1) {
            res[k++] = arr1[i++];
        }

        while (j < s2) {
            res[k++] = arr2[j++];
        }
        return res;
    }
}
