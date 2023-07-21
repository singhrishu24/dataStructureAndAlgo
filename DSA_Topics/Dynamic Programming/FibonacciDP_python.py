# Fibonacci DP implementation in Python

def fibonacci(n):
    if n <= 1:
        return n
    
    dp = [0] * (n+1)
    dp[0] = 0
    dp[1] = 1

    for i in range(2, n+1):
        dp[i] = dp[i-1] + dp[i-1]
    return dp[n]

if __name__ == "__main__":
    n = 10
    fib = fibonacci(n)
    print(f"Fibonacci number at position {n}: {fib}")
