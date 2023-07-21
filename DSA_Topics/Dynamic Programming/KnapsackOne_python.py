# KnapsackOne implementation in Python. 0/1 Approach.

def knapsack(capacity, weights, values, n):
    dp = [[0 for _ in range(capacity + 1)] for _ in range(n + 1)]

    for i in range(1, n + 1):
        for w in range(1, capacity + 1):
            if weights[i - 1] <= w:
                dp[i][w] = max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w])
            else:
                dp[i][w] = dp[i - 1][w]

    return dp[n][capacity]

if __name__ == "__main__":
    capacity = 7
    weights = [1, 3, 4, 5]
    values = [1, 4, 5, 7]
    n = len(weights)

    max_value = knapsack(capacity, weights, values, n)
    print("Maximum value that can be obtained:", max_value)
