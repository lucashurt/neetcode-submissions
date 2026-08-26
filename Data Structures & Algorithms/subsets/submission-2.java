class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,subset,res,0);
        return res;
    }
    public void backtrack(int[] nums,List<Integer> subset, List<List<Integer>> res, int index){
        if(index >= nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        backtrack(nums,subset,res,index+1);
        subset.remove(subset.size() - 1);
        backtrack(nums,subset,res,index+1);
    }
}
