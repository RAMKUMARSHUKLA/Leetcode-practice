class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int curr_sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            curr_sum+=nums[i];
            
            if(curr_sum>maxSum)
            {
                maxSum=curr_sum;
            }
            if(curr_sum<0)
            {
                curr_sum=0;
            }
        }
        return maxSum;
    }
}