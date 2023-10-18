class Solution {
    public int partitionString(String s) {
       int hash[]=new int[26];
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(hash[c-'a']==1)
            {
                count++;
                hash= new int[26];
            }
            hash[c-'a']++;
        }
        return count+1;
    }
}