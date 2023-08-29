class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size=nums1.length+nums2.length;
        int temp[]=new int[size];
        int i=0;
        for(;i<nums1.length;i++)
        {
            temp[i]=nums1[i];
        }
        int j=0;
        for(;i<size;i++)
        {
            temp[i]=nums2[j];
            j++;
        }
        Arrays.sort(temp);
        if(temp.length%2==0)
        {
           
            return (temp[size/2-1]+temp[size/2])/2.0;
        }
        else
        {
             return temp[temp.length/2];
        }
        
    }
    
}
