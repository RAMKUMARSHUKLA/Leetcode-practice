class Solution {
    public String longestPalindrome(String str) {
      boolean dp[][]=new boolean[str.length()][str.length()];
        int start=0;
        int end=0;
      
        for(int gap=0;gap<str.length();gap++)
        {
            for(int i=0,j=gap; j<dp[0].length; i++,j++)
            {
                if(gap==0)
                {
                    dp[i][j]=true;
                }
                
                else if(gap==1 && str.charAt(i)==str.charAt(j))
                {
                    dp[i][j]=true;
                }
                
                else if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1]==true)
                {
                    dp[i][j]=true;
                }
                if(dp[i][j])
                {
                    start=i;
                    end=j;
                }
            }
        }
        return str.substring(start,end+1);
    }
}