class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> sublist = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums,target,0,0,sublist,res);
        return res;
        
    }
    public void backtrack(int[] nums, int target, int index, int curSum, List<Integer> sublist, List<List<Integer>> res){
        if(curSum == target){
            res.add(new ArrayList<>(sublist));
            return;
        }
        if(curSum > target || index >= nums.length){
            return;
        }

        sublist.add(nums[index]);
        curSum += nums[index];
        backtrack(nums,target,index,curSum,sublist,res);
        sublist.remove(sublist.size()-1);
        curSum -= nums[index];
        backtrack(nums,target,index+1,curSum,sublist,res);
    }
}
