class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int currPrice = prices[i];
            if (currPrice - buyPrice > profit) {
                profit = currPrice - buyPrice;
            } else if (currPrice < buyPrice) {
                buyPrice = currPrice;
            }
        }
        return profit;
    }
}