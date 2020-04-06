package com.examples.io.arrays;

public class MaxSubArrayIndices {


    public static void main(String[] args) {
     int [] arrays = {-2,1,-3,4,-1,2,1,-5,4};
       // int [] arrays = {2,-1,3,-2,1};
        System.out.println(new MaxSubArrayIndices().maxSubArray(arrays));
    }
    public int maxSubArray(int arrays[]) {



        int maxSofar = arrays[0];
        int maxEndinghere = 0;

        int start = 0, end = 0, s = 0;

        for (int i = 0 ; i <arrays.length;i++) {

            maxEndinghere = maxEndinghere + arrays[i];

            if(maxSofar < maxEndinghere) {
                maxSofar = maxEndinghere;

                start = s;
                end = i;
            }

            if(maxEndinghere < 0) {
                maxEndinghere = 0;
                s = i+1;
            }
        }

        System.out.println("Start " + start + " end "+end);
        return  maxSofar;
    }
}
