public class LongestCommonSubsequence {
    public static int lcsLength(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[] dp = new int[n + 1];

        for (int i = 1; i <= m; i++) {
            int prev = 0;
            for (int j = 1; j <= n; j++) {
                int current = dp[j];
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[j] = prev + 1;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
                prev = current;
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String text1 = "ABCDGH";
        String text2 = "AEDFHR";

        int length = lcsLength(text1, text2);
        System.out.println("Length of Longest Common Subsequence: " + length);
    }
}        