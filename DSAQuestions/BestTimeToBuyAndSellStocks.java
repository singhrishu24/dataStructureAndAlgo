//Best time to buy and sell stock.
// Time Complexity : O(n)
// Space Complexity : O(1)

import java.util.Arrays;

public class BestTimeToBuyAndSellStocks
{
    public static int maxProfit(int[] prices)
    {
        int minPrice  = Integer.MAX_VALUE; //Initialize minPrice to the maximum value of Integer.
        int maxProfit = 0; //so that we can compare it with the first price in the array.
        
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < minPrice) minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit) maxProfit = prices[i] - minPrice;
        }
        return maxProfit;
    }
    
    //code for situation where we can buy multiple times but only hold one stock at a time.
    public static int maxProfitTwo(int[] prices)
    {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }

    //code for the situation where at most two transactions are allowed.
    public static int maxProfitThree(int[] prices)
    {
        int buyOne    = Integer.MAX_VALUE;
        int profitOne = 0;
        int buyTwo    = Integer.MAX_VALUE;
        int profitTwo = 0;

        for (int price : prices){
            buyOne    = Math.min(buyOne, price);
            profitOne = Math.max(profitOne, price - buyOne);
            buyTwo    = Math.min(buyTwo, price - profitOne);
            profitTwo = Math.max(profitTwo, price - buyTwo); 
        }
        return profitTwo;
    }
    
    //code for the situation where at most k transactions are allowed.
    public static int maxProfitK(int[] prices, int k)
    {
        //Optimized for Memory -------->>
        if (k <= 0 || prices == null || prices.length < 2) return 0;
        int n = prices.length;

        if (k >= n/2)
        {
            int maxProfit = 0;
            for (int i = 1; i < n; i++){
                if (prices[i] > prices[i-1]){
                    maxProfit += prices[i] - prices[i-1];
                }
            }
            return maxProfit;
        }

        int[] buy  = new int[k+1];
        int[] sell = new int[k+1];
        Arrays.fill(buy, Integer.MIN_VALUE);

        for (int price : prices){
            for (int j = k; j >= 1; j--){
                sell[j] = Math.max(sell[j], buy[j] + price);
                buy[j]  = Math.max(buy[j], sell[j-1] - price);
            }
        }
        return sell[k];

        //Optimized for Time -------->>
        /*
        int n = prices.length;
        int [][] dp = new int[n+1][(k*2)+2];
        for(int i = n-1; i >= 0; i--)
        {
            for (int j = k*2; j >= 0; j--){
                int amt = 0;
                if(j % 2 == 0){
                    amt = Math.max(dp[i+1][j], -prices[i], dp[i+1][j+1]);    
                }else {
                    amt = Math.max(dp[i+1][j], prices[i] + dp[i+1][j+1]);
                }
                dp[i][j] = amt;
            }
        }
        return dp[0][0]; */
    }
    
    
    
    //Driver Code
    public static void main(String[] args)
    {
        int[] prices  = {7,1,5,3,6,4};
        int maxProfit = maxProfitK(prices, 3);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}