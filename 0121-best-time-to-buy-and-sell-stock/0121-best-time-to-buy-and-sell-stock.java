class Solution {
    public int maxProfit(int[] prices) {
        int smallIndexValue=Integer.MAX_VALUE;
        int totalProfit=0;
        
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<smallIndexValue)
            {
                smallIndexValue=prices[i];
            }
            
            if(totalProfit<prices[i]-smallIndexValue)
            {
                totalProfit=prices[i]-smallIndexValue;
            }
        }
        return totalProfit;
        
        
    }
}