package ArrayMedium;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int profit  = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyprice) {
                buyprice = prices[i];
            }
            else {
                int curretprofit = prices[i] - buyprice;
                profit =  Math.max(curretprofit,profit);
            }
        }
        return profit;
    }
}
