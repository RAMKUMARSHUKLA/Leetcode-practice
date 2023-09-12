class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // Check if the starting cell has an obstacle.
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) {
            return 0; // No path if the start or end cell has an obstacle.
        }

        int[][] dp = new int[m][n];
        dp[0][0] = 1; // Initialize the starting cell.

        // Initialize the first column.
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                break; // If there's an obstacle, stop and don't proceed further.
            }
            dp[i][0] = 1;
        }

        // Initialize the first row.
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                break; // If there's an obstacle, stop and don't proceed further.
            }
            dp[0][j] = 1;
        }

        // Calculate the number of unique paths for each cell.
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
