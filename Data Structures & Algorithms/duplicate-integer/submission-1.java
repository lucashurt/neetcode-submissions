class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> counter = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            counter.put(nums[i],counter.getOrDefault(nums[i],0)+1);
        }
        for(int count : counter.values()){
            System.out.println(count);
            if(count>1){
                return true;
            }
        }
        return false;
    }
}