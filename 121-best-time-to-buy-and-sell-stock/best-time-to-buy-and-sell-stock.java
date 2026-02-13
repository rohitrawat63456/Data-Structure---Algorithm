class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int purchasedStockPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int currStockPrice = prices[i];
            if ((currStockPrice - purchasedStockPrice) > maxProfit) {
                maxProfit = currStockPrice - purchasedStockPrice;
            } else if (currStockPrice < purchasedStockPrice) {
                purchasedStockPrice = currStockPrice;
            }
        }
        return maxProfit;
    }
}