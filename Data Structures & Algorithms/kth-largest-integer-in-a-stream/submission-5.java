class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;
    public KthLargest(int k, int[] nums) {

        this.minHeap = new PriorityQueue<>();
        this.k = k;
        int res = 0;

        for(int num : nums){
            minHeap.offer(num);
        }
        for(int i=0;i<nums.length-k;i++){
           minHeap.poll(); 
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size()>k){
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
