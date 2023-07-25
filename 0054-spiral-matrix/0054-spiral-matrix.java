class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
          List<Integer> res = new ArrayList<>();
    if (matrix == null || matrix.length == 0) return res;

    int rows = matrix.length, cols = matrix[0].length;
    int left = 0, right = cols - 1, up = 0, down = rows - 1;

    while (res.size() < rows * cols) {
        for (int j = left; j <= right; j++) res.add(matrix[up][j]);
        up++;
        
        for (int i = up; i <= down; i++) res.add(matrix[i][right]);
        right--;
        
        if (res.size() < rows * cols) {
            for (int j = right; j >= left; j--) res.add(matrix[down][j]);
            down--;
        }
        
        if (res.size() < rows * cols) {
            for (int i = down; i >= up; i--) res.add(matrix[i][left]);
            left++;
        }
    }
        return res;
    }
}