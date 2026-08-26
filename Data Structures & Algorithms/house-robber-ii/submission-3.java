class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        return Math.max(
            helper(Arrays.copyOfRange(nums, 0, n - 1)),  // exclude last house
            helper(Arrays.copyOfRange(nums, 1, n))       // exclude first house
        );
    }

    public int helper(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        nums[n - 3] += nums[n - 1];
        for (int i = n - 4; i >= 0; i--) {
            nums[i] += Math.max(nums[i + 2], nums[i + 3]);
        }

        return Math.max(nums[0], nums[1]);
    }
}