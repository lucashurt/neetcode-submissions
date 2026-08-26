class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList(){});
        for(int i=0;i<nums.length;i++){
            int predecessors = res.size();
            for(int j=0;j<predecessors;j++){
                List<Integer> set = new ArrayList<>(res.get(j));
                set.add(nums[i]);
                res.add(set);
            }
        }
        System.out.println(res);
        return res;
    }
}
