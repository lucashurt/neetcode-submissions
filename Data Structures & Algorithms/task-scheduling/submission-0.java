class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        int time = 0; 
        for(char c : tasks){
            count[c - 'A']++;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<26;i++){
            if(count[i]>0) maxHeap.add(count[i]);
        }
        Queue<int[]> queue = new LinkedList<>(); 
        while(!queue.isEmpty() || !maxHeap.isEmpty()){
            time++;
            if(!maxHeap.isEmpty()){
                int remaining = maxHeap.poll() - 1;
                if(remaining>0){
                    queue.add(new int[]{remaining,time+n});
                }
            }
            else{
                time = queue.peek()[1];
            }
            if(!queue.isEmpty() && time == queue.peek()[1]){
                maxHeap.add(queue.poll()[0]);
                 
            }
        }
        return time;
    }
}
