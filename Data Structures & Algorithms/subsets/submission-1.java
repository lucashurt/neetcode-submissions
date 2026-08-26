class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums,subset,0,res);
        return res;
    }
    public void dfs(int[] nums, List<Integer> subset, int i ,List<List<Integer>> res){
        if(i >= nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(nums,subset,i+1,res);
        subset.remove(subset.size()-1);
        dfs(nums,subset,i+1,res);
    }
}
