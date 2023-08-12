class Solution {
    public int singleNonDuplicate(int[] nums) {
        
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums)
       {
           map.put(i,map.getOrDefault(i,0)+1);
       }
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                int val=entry.getKey();
                return val;
            }
        }
        return 0;
    }
}