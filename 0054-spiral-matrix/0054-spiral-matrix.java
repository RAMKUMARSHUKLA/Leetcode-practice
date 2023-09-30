class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res=new ArrayList<>();
        int minRow=0,minCol=0;
        int maxRow=matrix.length-1,maxCol=matrix[0].length-1;
        
        int tle=(maxRow+1)*(maxCol+1);
        int count=1;
        
        while(count<=tle)
        {
            for(int i=minCol;i<=maxCol && count<=tle;i++)
            {
                res.add(matrix[minRow][i]);
                count++;
            }
            minRow++;
            
             for(int i=minRow; i<=maxRow && count<=tle;i++)
            {
                res.add(matrix[i][maxCol]);
                count++;
            }
            maxCol--;
            
             for(int i=maxCol;i>=minCol && count<=tle;i--)
            {
                res.add(matrix[maxRow][i]);
                count++;
            }
            maxRow--;
            
             for(int i=maxRow;i>=minRow && count<=tle;i--)
            {
                res.add(matrix[i][minCol]);
                count++;
            }
            minCol++;
        }
        return res;
        
        

    }
}