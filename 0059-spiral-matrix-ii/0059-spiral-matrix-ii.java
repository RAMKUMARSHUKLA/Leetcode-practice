class Solution {
    public int[][] generateMatrix(int n) {
        
        int arr[][]=new int[n][n];
        int minRow=0,minCol=0,maxRow=n-1,maxCol=n-1;
        int tle=(n)*(n);
        int number=1;
        
        while(number<=tle)
        {
           for(int i=minCol; i<=maxCol && number<=tle; i++)
           {
               arr[minRow][i]=number;
               number++;
           }
            minRow++;
            
          for(int i=minRow; i<=maxRow && number<=tle; i++)
           {
               arr[i][maxCol]=number;
               number++;
           }
            maxCol--;
            
           for(int i=maxCol; i>=minCol && number<=tle; i--)
           {
               arr[maxRow][i]=number;
               number++;
           }
            maxRow--;
            
          for(int i=maxRow; i>=minRow && number<=tle; i--)
           {
               arr[i][minCol]=number;
               number++;
           }
            minCol++;
            
        }
        return arr;
        
//          int[][] matrix = new int[n][n];
//         int minRow = 0, minCol = 0, maxRow = n - 1, maxCol = n - 1;
//         int tle = n * n;
//         int number = 1;

//         while (number <= tle) {
//             // Traverse the top row from left to right
//             for (int i = minCol; i <= maxCol && number <= tle; i++) {
//                 matrix[minRow][i] = number;
//                 number++;
//             }
//             minRow++;

//             // Traverse the rightmost column from top to bottom
//             for (int i = minRow; i <= maxRow && number <= tle; i++) {
//                 matrix[i][maxCol] = number;
//                 number++;
//             }
//             maxCol--;

//             // Traverse the bottom row from right to left
//             for (int i = maxCol; i >= minCol && number <= tle; i--) {
//                 matrix[maxRow][i] = number;
//                 number++;
//             }
//             maxRow--;

//             // Traverse the leftmost column from bottom to top
//             for (int i = maxRow; i >= minRow && number <= tle; i--) {
//                 matrix[i][minCol] = number;
//                 number++;
//             }
//             minCol++;
//         }

//         return matrix;
        
    }
}