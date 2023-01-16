class Solution {
    public int numIslands(char[][] grid) {
         int count = 0;
        boolean visited[][]=new boolean[grid.length][grid[0].length];
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && visited[i][j]==false) {
                    count++;
                    clearRestOfLand(grid, i, j,visited);
                }
            }
        }
        return count;
    }
    
    private void clearRestOfLand(char[][] grid, int i, int j,boolean visited[][]) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0' || visited[i][j]==true) return;
        
        grid[i][j] = '0';
        clearRestOfLand(grid, i+1, j,visited);
        clearRestOfLand(grid, i-1, j,visited);
        clearRestOfLand(grid, i, j+1,visited);
        clearRestOfLand(grid, i, j-1,visited);
        return;
    }
}