class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        for(int i=nums.length-3;i>=0;i--){
            if(i != nums.length-3){
                nums[i] += Math.max(nums[i+2],nums[i+3]);
            }
            else{
                nums[i] += nums[i+2];
            }
        }
        return Math.max(nums[0],nums[1]);
    }
}
