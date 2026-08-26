class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(subset,0,0,candidates,target);
        return res;
    }
    public void dfs(List<Integer> subset,int cur, int i, int[] candidates, int target){
        if(cur == target){
            if(res.contains(subset)){
                return;
            }
            res.add(new ArrayList<>(subset));
            return;
        }
        if(cur>target || i>candidates.length-1){
            return;
        }
        subset.add(candidates[i]);
        dfs(subset,cur+candidates[i],i+1,candidates,target);
        subset.remove(subset.size()-1);
        dfs(subset,cur,i+1,candidates,target);
    } 
}
