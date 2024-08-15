package org.example.arrays;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int currentPrice = prices[0];

        for (int el : prices) {
            if (el > currentPrice) {
                profit = Math.max(profit, el - currentPrice);
            } else {
                currentPrice = el;
            }
        }

        return profit;
    }

    public static void main(String[] args) {

    }
}
