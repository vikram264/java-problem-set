package com.examples.io.arrays;

public class BestTimeToBuyOrSellStock {

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        BestTimeToBuyOrSellStock bestTimeToBuyOrSellStock = new BestTimeToBuyOrSellStock();
        System.out.println(bestTimeToBuyOrSellStock.maxProfit(prices));
    }
    public int maxProfit(int [] prices ) {
        //Set the initial Min value to buy a stock
        //Compare the elements in array with initial value and keep on updating the min value if lesser value is found.
        //Other Subtract the current value from the latest min value and store it as maxProfit and keep on updating till
        //the array is parsed completely

        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0;i<prices.length;i++) {

            if(prices[i]<minValue) {
                //Min Value to Buy a stock

                minValue = prices[i];
                System.out.println("min value "+minValue);
            } else if (prices[i]-minValue >maxProfit){
                maxProfit = prices[i] - minValue;

            }
        }
        return maxProfit;
    }


}
