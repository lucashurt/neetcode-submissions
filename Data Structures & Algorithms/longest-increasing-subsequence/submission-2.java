class Solution {
    public int lengthOfLIS(int[] nums) {
        int[]list = new int[nums.length];
        Arrays.fill(list,1);
        list[list.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--){
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    list[i] = Math.max(list[i], 1+list[j]);
                }
            }
        }
        return Arrays.stream(list).max().getAsInt();
    }
}
