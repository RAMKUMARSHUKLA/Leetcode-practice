class Solution {
    public int maxArea(int[] heights) {
        int leftIndex = 0;
        int rightIndex = heights.length - 1;
        int maxArea = 0;
        while (leftIndex < rightIndex) {
            int width = rightIndex - leftIndex;
            int leftHeight = heights[leftIndex];
            int rightHeight = heights[rightIndex];
            int minHeight = Math.min(leftHeight, rightHeight);
            int area = width * minHeight;
            maxArea = Math.max(area, maxArea);
            if (leftHeight <= rightHeight) {
                leftIndex += 1;
            } else {
                rightIndex -= 1;
            }
        }
        return maxArea;
    }
}