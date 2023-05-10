class Solution {
    public int arraySign(int[] nums) {
   int countNum=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==0)
        {
            return 0;
        }
        else if(nums[i]<1)
        {
            countNum++;
        }
    }
        return countNum%2==0? 1:-1;
        
        
    }
}