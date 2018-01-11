package com.kannan.collection.algorithms;

/**
 * @author Kannan Dharmalingam
 */
public class BuySellStockKTimes {
    private static int solve(int[] price, int k) {
        int n = price.length;

        // profit[t][i] representing the maximum profit you can make with at most t transactions up to a day i.
        int[][] profit = new int[k + 1][n];

        // You can't earn any money when you don't trade
        for (int day = 0; day < n; day++) {
            profit[0][day] = 0;
        }

        // Trading on day 0 several times doesn't earn you any money
        for (int t = 0; t <= k; t++) {
            profit[t][0] = 0;
        }

        for (int t = 1; t <= k; t++) {
            for (int day = 1; day < n; day++) {
                int doNothing = profit[t][day - 1];

                int makeTransaction = Integer.MIN_VALUE;
                // Find maximum
                for (int j=0; j<=day-1; j++) {
                    makeTransaction = Math.max(makeTransaction, price[day] - price[j] + profit[t-1][j]);
                }

                profit[t][day] = Math.max(doNothing, makeTransaction);
            }
        }

        return profit[k][n-1];

    }

    public static void main(String[] args) {
        //int[] price = { 310, 315, 275, 295, 260, 270, 290, 230, 255, 250 }; // with k=3, Output: 75
        //int[] price = { 12, 14, 17, 10, 14, 13, 12, 15 }; // with k=3, Output: 12
        //int[] price = { 100, 30, 15, 10, 8, 25, 80 }; // with k=3, Output: 72
        //int[] price = { 90, 80, 70, 60, 50 }; // with k=1, Output: 0
        int[] price = { 90, 80, 70, 60, 70 }; // with k=1, Output: 0
        int k = 1;
        System.out.println(solve(price, k));
    }
}
