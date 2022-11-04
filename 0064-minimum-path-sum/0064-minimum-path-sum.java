class Solution {
    public int minPathSum(int[][] grid) {
    //Using memoization
        int m=grid.length;
        int n=grid[0].length;
        int storage[][]=new int [m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                storage[i][j]=-1;
            }
        }
        return minPathSumM(grid,0,0,storage);
    }
    
    private static int minPathSumM(int arr[][],int i,int j,int storage[][])
    {
        //Calculated rows and column size
        int m=arr.length;
        int n=arr[0].length;
        
        if(i==m-1 && j==n-1)
        {
            storage[i][j]=arr[i][j];
            return storage[i][j];
        }
        
        if(i>=m || j>=n)
        {
            return Integer.MAX_VALUE;
        }
        
        //checking for already calculated path
        if(storage[i][j]!=-1)
        {
            return storage[i][j];
        }
        
        //move in right direction
        int op1=minPathSumM(arr,i,j+1,storage);
        //move in down direction
        int op2=minPathSumM(arr,i+1,j,storage);
        storage[i][j]=arr[i][j]+Math.min(op1,op2);
        return storage[i][j];
        
        
        
    }
}