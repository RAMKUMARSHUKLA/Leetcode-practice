class Solution {
    public String longestPalindrome(String str) {
     boolean dp[][]=new boolean[str.length()][str.length()];
       
        int start=0;
        int end=0;
    for(int g=0;g<str.length();g++)
    {
        for(int i=0,j=g; j<dp[0].length;i++,j++)
        {
            if(g==0)
            {
                dp[i][j]=true;
            }
            
            else if(g==1 && str.charAt(i)==str.charAt(j))
            {
                dp[i][j]=true;
                
            
            }
            
            else if(str.charAt(i)==str.charAt(j) && dp[i+1][j-1])
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