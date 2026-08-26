class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(res,subset,nums,0);
        System.out.println(res);
        return res;
    }
    public void dfs(List<List<Integer>>res,List<Integer> subset, int[] nums, int index ){
        if(index >= nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!subset.contains(nums[i])){
                subset.add(nums[i]);
                dfs(res,subset,nums,index+1);
                subset.remove(subset.size()-1);
            }
        }
    }

}
