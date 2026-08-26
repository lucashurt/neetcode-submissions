class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int num: nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        int[] res = new int[k];
        while(k>0){
            int key = -1;
            int frequency = -1;

            for(Map.Entry<Integer,Integer> entry : count.entrySet()){
                if(entry.getValue() > frequency){
                    key = entry.getKey();
                    frequency = entry.getValue();
                }
            }
            res[k-1] = key;
            count.remove(key);
            k--;
        }
        return res;
    }
}
