class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
      if(n==1)
      {
          return nums[0];
      }
        
    int max1=maxRob(nums,0,n-2);
    int max2=maxRob(nums,1,n-1);
    return Math.max(max1,max2);
    }
    
    public int maxRob(int nums[],int start,int end)
    {
        int currMax=0;
       int prevMax=0;
       for(int i=start;i<=end;i++)
       {
           int temp=currMax;
           currMax=Math.max(prevMax+nums[i],currMax);
           prevMax=temp;
       }
        return currMax;
    }
}
