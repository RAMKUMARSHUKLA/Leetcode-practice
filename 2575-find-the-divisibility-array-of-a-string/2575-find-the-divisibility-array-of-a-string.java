class Solution {
    public int[] divisibilityArray(String word, int m) {
        
        int size=word.length();
        int ch[]=new int[size];
        
        long prefixValue=0;
      
        
        for(int i=0;i<size;i++)
        {
            int digit=word.charAt(i)-'0';
            prefixValue=(prefixValue*10+digit)%m;
            if(prefixValue==0)
            {
                ch[i]=1;
            }
            else
            {
                ch[i]=0;
            }
            
        }
        return ch;
        
        
    }
}