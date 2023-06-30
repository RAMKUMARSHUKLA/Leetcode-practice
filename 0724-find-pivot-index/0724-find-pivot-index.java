class Solution {
    public int pivotIndex(int[] nums) {
   int leftSum=0;
   int totalSum=0;
        
    for(int ele:nums)
    {
        totalSum+=ele;
    }
        
    for(int i=0;i<nums.length; leftSum+=nums[i++])
    {
        if(leftSum*2==totalSum-nums[i])
        {
            return i;
        }
    }
        return -1;
        
        
  }
}