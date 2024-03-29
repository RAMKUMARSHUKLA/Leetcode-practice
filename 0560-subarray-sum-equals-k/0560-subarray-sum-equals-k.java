class Solution {
    public int subarraySum(int[] nums, int target) {
   HashMap<Integer,Integer> map=new HashMap<>();
   map.put(0,1);
   int ans=0;  
   int sum=0;
        
    for(int i=0;i<nums.length;i++)
    {
        sum+=nums[i];
        //if we got the key we can assume that there are index that are equal to k
        if(map.containsKey(sum-target))
        {
            ans+=map.get(sum-target);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
    }
        return ans;
         
         
    }
}