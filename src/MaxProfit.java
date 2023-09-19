public class MaxProfit {
    public int maxProfit(int[] prices) {
        int max = 0, min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
            max = Math.max(max, price - min);
        }
        return max;
    }

    public int maxProfit2(int[] prices) {
        // find min
        int min = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
        }
        // slicing after index of the min, then finding the max after that
        int max = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
}
