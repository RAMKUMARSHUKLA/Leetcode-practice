class Solution {
    public boolean isMatch(final String s, final String p) {
        int i=s.length();
        int j=p.length();
        Boolean memo[][]=new Boolean[i+1][j+1];
        return isMatchRecursion(i-1,j-1,s,p,memo);
    }
    private boolean isMatchRecursion(int i,int j,String s, String p,Boolean[][] memo)
    {
        if(i<0 && j<0) return true;
        if(i>=0 && j<0) return false; //i is exhausted
        if(i<0 && j>=0)
        {
            for(int jj=0; jj<=j; jj++)
            {
              if(p.charAt(jj)!='*') return false;
            }
            return true;           
        }
        if(memo[i][j]!=null) return memo[i][j];

        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')
        {
            return memo[i][j]= isMatchRecursion(i-1,j-1,s,p,memo);
        }
        if(p.charAt(j)=='*')
        {
            return memo[i][j]= isMatchRecursion(i-1,j,s,p,memo) || isMatchRecursion(i,j-1,s,p,memo);
        }
        return memo[i][j]=false;
    }
}