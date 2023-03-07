class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res=new ArrayList<>();
    if(matrix.length<1)
        return res;
    int m=matrix.length; int n=matrix[0].length;
    int pacific[][]=new int[m][n];
    int atlantic[][]=new int[m][n];
    
    for(int col=0;col<n;col++)
    {
        fnc(matrix,0,col,Integer.MIN_VALUE,pacific);
        fnc(matrix,m-1,col,Integer.MIN_VALUE,atlantic);
    }
        
      for(int row=0;row<m;row++)
    {
        fnc(matrix,row,0,Integer.MIN_VALUE,pacific);
        fnc(matrix,row,n-1,Integer.MIN_VALUE,atlantic);
    }
    
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(pacific[i][j]==1 && atlantic[i][j]==1)
            {
                List<Integer> v=new ArrayList<>();
                v.add(i);
                v.add(j);
                res.add(v);
            }
        }
    }
        return res;
        
}
    
    public void fnc(int matrix[][],int i,int j,int prev,int ocean[][])
    {
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length)
        {
            return;
        }
        if(ocean[i][j]==1) return ;
        if(matrix[i][j]<prev) return;
        ocean[i][j]=1;
        
        fnc(matrix,i+1,j,matrix[i][j],ocean);
        fnc(matrix,i-1,j,matrix[i][j],ocean);
        fnc( matrix,i,j+1,matrix[i][j],ocean);
        fnc(matrix,i,j-1,matrix[i][j],ocean);
        
        
    }
}