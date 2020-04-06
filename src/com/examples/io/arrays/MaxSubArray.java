package com.examples.io.arrays;

public class MaxSubArray {

    public static void main(String[] args) {
        int [] arrays = {-2,1,-3,4,-1,2,1,-5,4};
        //int [] arrays = {-1,-1,-5,-1,-1,-1};
        System.out.println(new MaxSubArray().maxSubArray(arrays));
    }



    public int maxSubArray(int arrays[]) {

        int maxSofar = arrays[0];
        int maxPostiveNumber = 0;
        int s = 0,start = 0, end = 0;

        for(int i = 0 ;i < arrays.length;i++) {
            maxPostiveNumber = Math.max(arrays[i],arrays[i]+maxPostiveNumber);
            maxSofar = Math.max(maxPostiveNumber,maxSofar);
            if (maxSofar < maxPostiveNumber) {
                start = s;
                end  = i;
            }
            if(maxSofar<0) {
                maxSofar = 0;
                s = i+1;
            }
        }

        System.out.println("start " + start + " ");
        return maxSofar;
    }



}
