class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<stones.length;i++){
            minHeap.offer(-stones[i]);
        }
        while(minHeap.size()>1){
            int a = minHeap.poll();
            int b = minHeap.poll();
            if(b>a){
                minHeap.offer(a-b);
            }
        }
        minHeap.offer(0);
        return Math.abs(minHeap.peek());
    }
}
