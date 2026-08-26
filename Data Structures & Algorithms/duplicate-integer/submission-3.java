class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueLetters = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!uniqueLetters.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}