class Solution {
    public int maxProfit(int[] prices) {
       int smallIndex=Integer.MAX_VALUE;
       int totalProfit=0;
        
       for(int i=0;i<prices.length;i++)
       {
           if(prices[i]<smallIndex)
           {
               smallIndex=prices[i];
           }
           
           if(totalProfit<prices[i]-smallIndex)
           {
               totalProfit=prices[i]-smallIndex;
           }
       }
        return totalProfit;
        
        
    }
}