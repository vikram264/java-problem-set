package com.examples.io.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
    int array [] = {5,6,6,7,2,1,7};
    findDuplicate(array);
    }

    public static void findDuplicate(int [] array) {
        List<Integer> list = new ArrayList<>();


        for(int  i = 0;i<array.length;i++) {
            int index = Math.abs(array[i]) -1;

            if(array[index] < 0) {
                list.add(index+1);
            } else {
                array[index] = -array[index];
                System.out.println(array[index]);
            }
        }
        System.out.println(list.toString());

    }
}
