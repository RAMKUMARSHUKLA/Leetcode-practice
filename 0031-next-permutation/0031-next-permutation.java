class Solution {
    public void nextPermutation(int[] nums) {
         int n = nums.length;
        int index1 = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index1 = i;
                break;
            }
        }

        // Step 2
        if (index1 == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 4
        int index2 = -1;
        for (int i = n - 1; i > index1; i--) {
            if (nums[i] > nums[index1]) {
                index2 = i;
                break;
            }
        }

        // Step 5
        swap(nums, index1, index2);

        // Step 6
        reverse(nums, index1 + 1, n - 1);
    }
     private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
}