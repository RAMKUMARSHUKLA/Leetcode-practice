class Solution {
    public int maxArea(int[] heights) {
        int leftIndex=0;
        int rightIndex=heights.length-1;
        int maxarea=0;

        while(leftIndex<rightIndex)
        {
            int width=rightIndex-leftIndex;
            int leftVal=heights[leftIndex];
            int rightVal=heights[rightIndex];
            int minHeight=Math.min(leftVal,rightVal);
            int area=minHeight*width;
            maxarea=Math.max(maxarea,area);

            if(leftVal<=rightVal) leftIndex+=1;
            else rightIndex-=1;
        }
        return maxarea;
    }
}