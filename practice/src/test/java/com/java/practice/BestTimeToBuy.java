package com.java.practice;


import org.junit.jupiter.api.Test;

/*
//Example 1:
Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

Url: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150

*/
public class BestTimeToBuy {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = Integer.MAX_VALUE;

        for(int i = 0; i <  prices.length; i++){
            if(lowestPrice > prices[i]){
                lowestPrice  = prices[i];
            } else if(prices[i] - lowestPrice > maxProfit){
                maxProfit = prices[i] - lowestPrice;
            }
        }
        return maxProfit;

    }

    @Test
    void testMaxProfit(){

        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + maxProfit(prices1));

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Max Profit: " + maxProfit(prices2));
    }
}
