class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }

        Map<Integer,Integer> count = new HashMap<>(); 

        for(int i=0;i<hand.length;i++){
            count.put(hand[i],count.getOrDefault(hand[i],0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(count.keySet());

        while(!pq.isEmpty()){
            int first = pq.peek();
            for(int i = first; i<first+groupSize;i++){
                if(!count.containsKey(i)){
                    return false;
                }
                count.put(i,count.get(i)-1);
                if(count.get(i) == 0){
                    if(pq.peek() != i){
                        return false;
                    }
                    pq.poll();
                }
            }
        }
        return true;
    }
}
