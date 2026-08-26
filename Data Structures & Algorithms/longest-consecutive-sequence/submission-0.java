class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
          
        for(int num:nums){
            set.add(num);
        }
        for(int element: set){
            int count = 1;
             if(set.contains(element-1)){
                continue;
             }
             while(set.contains(element+count)){
                count++;
             }
             res = Math.max(res,count);
             continue;
        }
        return res;
    }
}
