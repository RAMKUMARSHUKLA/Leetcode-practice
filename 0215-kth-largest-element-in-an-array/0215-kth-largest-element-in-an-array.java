class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int i=0;
        for(;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(;i<arr.length;i++)
        {
            int min=pq.element();
            
            if(min<arr[i])
            {
                pq.remove();
                pq.add(arr[i]);
            }
        }
        int sol=pq.element();
        return sol;
    }
}