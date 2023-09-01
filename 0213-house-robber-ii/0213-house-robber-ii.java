class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        // Calculate the maximum amount if you rob the first house and exclude the last house
        int max1 = robLinear(nums, 0, n - 2);
        // Calculate the maximum amount if you exclude the first house and consider the last house
        int max2 = robLinear(nums, 1, n - 1);
        // Return the maximum of the two scenarios
        return Math.max(max1, max2);
    }
    
    // Helper function to calculate maximum amount for a linear sequence of houses
    private int robLinear(int[] nums, int start, int end) {
        int prevMax = 0;
        int currMax = 0;
        for (int i = start; i <= end; i++) {
            int temp = currMax;
            currMax = Math.max(prevMax + nums[i], currMax);
            prevMax = temp;
        }
        return currMax;
    }
}
