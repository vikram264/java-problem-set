package com.examples.io.arrays;

import java.util.Arrays;

public class TwoMissingNumbers {


    public static void main(String[] args) {
        int array[] = {1,2,3,5};
        TwoMissingNumbers twoMissingNumbers = new TwoMissingNumbers();
        Arrays.stream(twoMissingNumbers.twoMissingNumbers(array)).forEach(System.out::println);
    }


    public int[] twoMissingNumbers(int [] array) {

        int size = array.length + 2;
        long totalSum = size *(size+1)/2;
        System.out.println("total sum "+totalSum);
        long arraySum = 0;

        for(int i=0;i<array.length;i++) {
            arraySum = arraySum + array[i];
        }
        System.out.println("array sum "+arraySum);


        int midPoint = (int) ((totalSum - arraySum)/2);
        System.out.println("mid point "+ midPoint);

        int totalSumLeftXOR = 0;
        int arraySumLeftXOR = 0;
        int totalSumRightXOR =0;
        int arraySumRightXOR = 0;


        for(int i=1;i<=midPoint;i++) {
           // totalSumLeftXOR^=i;
            totalSumLeftXOR = totalSumLeftXOR^i;
            System.out.println("totalSumLeftXOR in loop" + totalSumLeftXOR);
        }

        System.out.println("totalSumLeftXOR "+ totalSumLeftXOR);
        for(int i=midPoint+1;i<=size;i++) {
            //totalSumRightXOR^=i;
            totalSumRightXOR = totalSumRightXOR^i;
        }
        System.out.println("totalSumRightXOR "+ totalSumRightXOR);

        for(int i=0;i<array.length;i++) {
            if(i<=midPoint) {
             // arraySumLeftXOR^=i;
                arraySumLeftXOR = arraySumLeftXOR^array[i];

            } else {
               // arraySumRightXOR^=i;
                arraySumRightXOR = arraySumRightXOR^array[i];
            }
        }

        System.out.println("arraySumLeftXOR " + arraySumLeftXOR);
        System.out.println("arraySumRightXOR " + arraySumRightXOR);
        /*for(int i=1;i<=midPoint;i++) {
        totalSumLeftXOR = totalSumLeftXOR^i;
        }
        System.out.println("totalSumLeftXOR "+totalSumLeftXOR);

        for(int i=midPoint +1;i<=size;i++) {
            totalSumRightXOR = totalSumRightXOR^i;
        }


        for(int i=1;i<array.length;i++) {
            if(array[i]<midPoint) {
                arraySumLeftXOR = arraySumLeftXOR^array[i];
            } else {
                arraySumRightXOR = arraySumRightXOR^array[i];
            }
        }
*/

        return new int[] {totalSumLeftXOR^arraySumLeftXOR,totalSumRightXOR^arraySumRightXOR};
    }
}
