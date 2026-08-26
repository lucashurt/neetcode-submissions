class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        List<Integer>[] values = new List[nums.length+1];
        for(int i=0;i<nums.length;i++){
            count.put(nums[i],count.getOrDefault(nums[i],0) + 1);
        }
        for(int i=0;i<=nums.length;i++){
            values[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry: count.entrySet()){
            values[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for(int i=values.length-1;i>0;i--){
            if(index >= k){
                return res;
            }
            else{
                for(int value: values[i]){
                    res[index] = value;
                    index++;
                    if(index >= k){
                        return res;
                    }
                }
            }
        }
        return res;
    }
}
