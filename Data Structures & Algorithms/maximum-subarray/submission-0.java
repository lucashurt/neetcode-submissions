class Solution {
    public int maxSubArray(int[] nums) {
        int total = nums[0];
        int currentSum = 0;
        int index = 0;

        for(int i = 0;i<nums.length;i++){
            if(currentSum<0){
                index = i+1;
                currentSum = 0;
            }
            currentSum+=nums[i];
            total= Math.max(currentSum,total);

        }
        return total;
    }
}
