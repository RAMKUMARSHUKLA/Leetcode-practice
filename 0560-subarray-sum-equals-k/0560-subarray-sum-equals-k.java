class Solution {
    public int subarraySum(int[] nums, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
    int freq=0;
    int sum=0;
        
    for(int i=0;i<nums.length;i++)
    {
        sum+=nums[i];
        if(map.containsKey(sum-target))
        {
            freq+=map.get(sum-target);
        }
        
        //if not in map then put 1 else value at key(sum)+1
        map.put(sum,map.getOrDefault(sum,0)+1);
    }
        return freq;
         
         
    }
}