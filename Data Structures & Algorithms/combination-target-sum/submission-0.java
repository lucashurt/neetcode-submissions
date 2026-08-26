class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums,subset,res,0,target);
        return res;
    }
    public void dfs(int[] nums, List<Integer> subset, List<List<Integer>> res,int i, int target){
        if(i>=nums.length || target<0){
            return;
        }
        else if(target == 0){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        dfs(nums,subset,res,i,target-nums[i]);
        subset.remove(subset.size()-1);
        dfs(nums,subset,res,i+1,target);
    }
}
