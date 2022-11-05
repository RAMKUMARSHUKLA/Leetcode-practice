class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length()+1;
        int n=text2.length()+1;
        int storage[][]=new int[m][n];
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                storage[i][j]=-1;
            }
        }
        return lcsM(text1,text2,storage);
    }
    
    private static int lcsM(String s,String t,int[][] storage)
    {
        int m=s.length();
        int n=t.length();
        
        if(storage[m][n]!=-1)
        {
            return storage[m][n];
        }
        if(m==0 || n==0)
        {
            storage[m][n]=0;
            return storage[m][n];
        }
        
        if(s.charAt(0)==t.charAt(0))
        {
            storage[m][n]=1+lcsM(s.substring(1),t.substring(1),storage);
            return storage[m][n];
        }
        else
        {
            int op1=lcsM(s,t.substring(1),storage);
            int op2=lcsM(s.substring(1),t,storage);
            
            storage[m][n]=Math.max(op1,op2);
        }
        return storage[m][n];
        
    }
}