class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

            return Math.max(
                helper(Arrays.copyOfRange(nums, 0, nums.length - 1)),  // exclude last house
                helper(Arrays.copyOfRange(nums, 1, nums.length))       // exclude first house
        );
    }
    public int helper(int[] nums){
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        for(int i=nums.length-3;i>=0;i--){
            if(i<nums.length-3){
                nums[i] += Math.max(nums[i+2],nums[i+3]);
            }
            else{
                nums[i] += nums[i+2];
            }
        }
        return Math.max(nums[0],nums[1]);
    }
    }
