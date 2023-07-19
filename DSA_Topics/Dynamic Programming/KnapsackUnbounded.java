// Knapsack Unbounded Problem : each item can be included multiple times.

public class KnapsackUnbounded{
    public static int knapsack(int capacity, int[] weights, int[] values, int n){
        int[] dp = new int[capacity+1];

        for (int w = 1; w <= capacity; w++){
            for (int i = 0; i < n; i++){
                if (weights[i] <= w){
                    dp[w] = Math.max(dp[w], values[i]+dp[w-weights[i]]);
                }
            }
        }
        return dp[capacity];
    }

    public static void main(String[] args){
        int capacity = 7;
        int[] weights = {1,3,4,5};
        int[] values = {1,4,5,7};
        int n = weights.length;

        int maxValue = knapsack(capacity, weights, values, n);
        System.out.println("Maximum value that can be obtained: " + maxValue);
    }
}