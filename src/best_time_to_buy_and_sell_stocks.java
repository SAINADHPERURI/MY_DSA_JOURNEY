import java.util.Arrays;

public class best_time_to_buy_and_sell_stocks {

    static class Solution {
        public int maxProfit(int[] prices) {
            if (prices == null || prices.length == 0) {
                return 0;
            }

            int maxProfit = 0;
            int bestBuy = prices[0];

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > bestBuy) {
                    maxProfit = Math.max(maxProfit, prices[i] - bestBuy);
                } else {
                    bestBuy = Math.min(bestBuy, prices[i]);
                }
            }

            return maxProfit;
        }
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        Solution solution = new Solution();
        int result = solution.maxProfit(prices);

        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Maximum Profit: " + result);
    }
}
