class Solution {
    public int maxProfit(int[] prices) {
      int totalProfit=0;
        int op=0;
      int smallestVal=Integer.MAX_VALUE;
       
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<smallestVal)
            {
                smallestVal=prices[i];
            }
            
            totalProfit=prices[i]-smallestVal;
            if(totalProfit>op)
            {
                op=totalProfit;
            }
        }
        return op;
    
        
        
    }
}