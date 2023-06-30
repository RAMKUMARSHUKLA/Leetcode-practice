class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
//         int sum=0;
//         int freq=0;
//         HashSet<Integer> map=new HashSet<>();
        
    
        
//         for(int i=0;i<nums.length;i++)
//         {
//             sum+=nums[i];
//             if(map.contains(sum-k))
//             {
//                 return true;
//             }
//             map.add(nums[i]);
            
//         }
//         return false;
        
        Map<Integer, Integer> hashMap = new HashMap<>(Map.of(0, 0));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // if the remainder sum % k occurs for the first time
            if (!hashMap.containsKey(sum % k))
                hashMap.put(sum % k, i + 1);
            // if the subarray size is at least two
            else if (hashMap.get(sum % k) < i)
                return true;
        }
        return false;
      
        
    }
}