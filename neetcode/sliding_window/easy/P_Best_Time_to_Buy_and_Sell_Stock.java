package sliding_window.easy;

public class P_Best_Time_to_Buy_and_Sell_Stock {
    class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int minPrice = Integer.MAX_VALUE;

            for (int price : prices) {
                minPrice = Math.min(minPrice, price);

                int profit = price - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }

            return maxProfit;
        }
    }
}
