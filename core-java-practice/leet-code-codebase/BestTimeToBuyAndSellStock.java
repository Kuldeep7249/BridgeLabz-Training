public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, maxProfit = 0;
        for (int p : prices) {
            if (p < min) min = p;
            else maxProfit = Math.max(maxProfit, p - min);
        }
        return maxProfit;
    }
}