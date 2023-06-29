class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int s1=nums1.length;
      int s2=nums2.length;
       double[] temp=new double[s1+s2];
      int i=0,j=0,k=0;
        
        //sorting
        while(i<s1 && j<s2)
        {
            if(nums1[i]<nums2[j])
            {
                temp[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                temp[k]=nums2[j];
                k++;
                j++;
            }
        }
        
        // Copying into temp array if nums1 is exhausted
        if(i>=s1)
        {
            for(int t=j;t<s2;t++)
            {
                temp[k]=nums2[t];
                k++;
            }
        }
         // Copying into temp array if nums2 is exhausted
        if(j>=s2)
        {
            for(int t=i;t<s1;t++)
            {
                temp[k]=nums1[t];
                k++;
            }
        }
       
        
        if(temp.length%2!=0)
        {
            return temp[temp.length/2];
        }
        else
        {
            return (temp[temp.length/2]+temp[temp.length/2-1])/2;
        }
        
    }
    
}
