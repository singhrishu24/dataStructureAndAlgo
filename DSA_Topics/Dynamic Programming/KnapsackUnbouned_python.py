# Knapsack Unbounded implementation using Python.

def knapsack(capacity, weights, values, n):
    dp = [0] * (capacity + 1)

    for w in range(1, capacity + 1):
        for i in range(n):
            if weights[i] <= w:
                dp[w] = max(dp[w], values[i] + dp[w - weights[i]])

    return dp[capacity]

if __name__ == "__main__":
    capacity = 7
    weights = [1, 3, 4, 5]
    values = [1, 4, 5, 7]
    n = len(weights)

    max_value = knapsack(capacity, weights, values, n)
    print("Maximum value that can be obtained:", max_value)
