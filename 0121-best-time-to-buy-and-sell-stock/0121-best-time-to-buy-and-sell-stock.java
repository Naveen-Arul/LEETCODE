class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            // update minimum buying price
            minPrice = Math.min(minPrice, price);

            // calculate today's profit
            int profit = price - minPrice;

            // update maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}