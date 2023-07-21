# Longest Common Prefix implementation in Python.

def lcs_length(text1, text2):
    m = len(text1)
    n = len(text2)
    dp = [0] * (n+1)

    for i in range(1, m+1):
        prev = 0
        for j in range(1, n+1):
            current = dp[j]
            if text1[i-1] == text2[j-1]:
                dp[j] = prev + 1
            else:
                dp[j] = max(dp[j], dp[j-1])
            prev = current
    return dp[n]

if __name__ == "__main__":
    text1 = "ABCDGH"
    text2 = "AEDFHR"

    length = lcs_length(text1, text2)
    print("Length of Longest Common Subsequence:", length)                