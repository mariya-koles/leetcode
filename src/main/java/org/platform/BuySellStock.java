package org.platform;

public class BuySellStock {
    public static void main(String[] args) {
//        You are given an integer array prices where prices[i] is the price of NeetCoin on the ith day.
//
//        You may choose a single day to buy one NeetCoin and choose a different day in the future to sell it.
//
//        Return the maximum profit you can achieve. You may choose to not make any transactions, in which case the profit would be 0.
        int[] prices = {3, 6, 5, 10, 1};
        System.out.println(buySellStock(prices));
    }

    public static int buySellStock(int[] prices) {
        int best = 0;
        for (int i = 0; i < prices.length; i++){
            int buyPrice = prices[i];
            for (int j = i+1; j < prices.length; j++){
                int sellPrice = prices[j];
                best = Math.max(best, sellPrice - buyPrice);
            }
        }
        return best;

    }




}