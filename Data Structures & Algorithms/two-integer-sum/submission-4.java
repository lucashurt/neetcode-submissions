class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference = target - nums[i];
            if(count.containsKey(difference)){
                return new int[]{count.get(difference),i};
            }
            count.put(nums[i],i);
        }
        return new int[]{};
    }
}
