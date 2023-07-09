import sys

def maxProfit(prices):
    minPrice = sys.maxsize
    maxProfit = 0

    for price in prices:
        if price < minPrice:
            minPrice = price
        elif price - minPrice > maxProfit:
            maxProfit = price - minPrice

    return maxProfit

def maxProfitTwo(prices):
    maxProfit = 0

    for i in range(1, len(prices)):
        if prices[i] > prices[i-1]:
            maxProfit += prices[i] - prices[i-1]

    return maxProfit

def maxProfitThree(prices):
    buyOne = sys.maxsize
    profitOne = 0
    buyTwo = sys.maxsize
    profitTwo = 0

    for price in prices:
        buyOne = min(buyOne, price)
        profitOne = max(profitOne, price - buyOne)
        buyTwo = min(buyTwo, price - profitOne)
        profitTwo = max(profitTwo, price - buyTwo)

    return profitTwo


def maxProfitK(prices, k):
    if k <= 0 or not prices or len(prices) < 2:
        return 0
    
    n = len(prices)

    if k >= n//2:
        maxProfit = 0

        for i in range(1, n):
            if prices[i] > prices[i-1]:
                maxProfit += prices[i] - prices[i-1]
        return maxProfit

    buy = [float('-inf')] * (k+1)
    sell = [0] * (k+1)

    for price in prices:
        for j in range(k, 0, -1):
            sell[j] = max(sell[j], buy[j]+price)
            buy[j] = max(buy[j], sell[j-1]-price)
    return sell[k]

#Driver Code
prices = [7,1,5,3,6,4]
maxProfit = maxProfitK(prices, 3)
print("maximum Profit:", maxProfit)
