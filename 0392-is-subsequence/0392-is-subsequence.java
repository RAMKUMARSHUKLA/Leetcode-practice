class Solution {
    public boolean isSubsequence(String s, String t) {
      int k=0;
      if(s.length()==0)
      {
          return true;
      }
        
      for(int i=0;i<t.length();i++)
      {
          if(s.charAt(k)==t.charAt(i))
          {
              k++;
          }
          if(k==s.length())
          {
              return true;
          }
      }
        return false;
    }
}