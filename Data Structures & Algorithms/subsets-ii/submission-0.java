class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);
        dfs(subset,nums,0);
        return res;
    }
    public void dfs(List<Integer> subset, int[] nums, int i){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        dfs(subset,nums,i+1);
        subset.remove(subset.size()-1);

        int count = 0;
        for(int j=i;j<nums.length;j++){
            if(nums[j] == nums[i]) count++;
            else{
                break;
            }
        }
        dfs(subset,nums,i+count);
    }
}
