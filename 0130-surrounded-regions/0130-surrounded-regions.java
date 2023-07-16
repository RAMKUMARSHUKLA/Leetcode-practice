class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }

        int rows = board.length;
        int cols = board[0].length;

        // Traverse the boundary cells and mark all 'O's and their connected 'O's as 'B'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || i == rows - 1 || j == 0 || j == cols - 1) && board[i][j] == 'O') {
                    markConnectedO(board, i, j);
                }
            }
        }

        // Flip the remaining 'O's (unmarked 'O's) to 'X' and restore the 'B's back to 'O'
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'B') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void markConnectedO(char[][] board, int i, int j) {
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O') {
            return;
        }

        board[i][j] = 'B'; // Mark the 'O' as 'B' to indicate it's connected to the boundary 'O's

        // Recursively mark all connected 'O's
        markConnectedO(board, i - 1, j);
        markConnectedO(board, i + 1, j);
        markConnectedO(board, i, j - 1);
        markConnectedO(board, i, j + 1);
    }
}
