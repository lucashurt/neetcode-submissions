class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int complement = target -  nums[i];
        if(map.containsKey(complement)){
            int min = Math.min(i,map.get(complement));
            int max = Math.max(i,map.get(complement));
            return new int[]{min,max};
        }
        map.put(nums[i],i);
      }
      return new int[]{};  
    }
}
