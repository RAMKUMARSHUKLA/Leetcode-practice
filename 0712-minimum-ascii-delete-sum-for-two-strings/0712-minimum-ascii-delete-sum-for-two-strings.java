class Solution {
    public int minimumDeleteSum(String s1, String s2) {
         int m = s1.length();
    int n = s2.length();

    // Create a 2D DP table with dimensions (m+1) x (n+1)
    int[][] dp = new int[m + 1][n + 1];

    // Initialize the first row and first column of the DP table
    for (int i = 1; i <= m; i++) {
        dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
    }
    for (int j = 1; j <= n; j++) {
        dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
    }

    // Fill in the DP table
    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                dp[i][j] = dp[i - 1][j - 1];
            } else {
                dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
            }
        }
    }

    // The bottom-right cell contains the minimum ASCII sum
    return dp[m][n]; 
    }
}