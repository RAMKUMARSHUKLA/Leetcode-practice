class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ent=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                ent=nums[i];
                count=1;
            }
            else if(nums[i]==ent)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        
        int count1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==ent)
            {
                count1++;
            }
        }
            if(count1>(nums.length/2)){
                return ent;
            }
            return -1;
        
    }
}