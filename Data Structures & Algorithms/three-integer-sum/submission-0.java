class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            int l=i+1,r=nums.length-1;
            int target = nums[i]*-1;

            while(l<r){
                int sum = nums[l] + nums[r];

                if(sum>target){
                    r--;
                }

                else if(sum<target){
                    l++;
                } 

                else{
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    while(nums[l] == nums[l-1] && l<r){
                        l++;
                    }
                }

            }
        }
        return res;
    }
}
