class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a,b) -> Integer.compare(a[0],b[0])
        );
        for(int i=0;i<points.length;i++){
            int distance = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            minHeap.offer(new int[]{-distance,points[i][0],points[i][1]});
            if(minHeap.size()>k) minHeap.poll();
        }
        int[][] res = new int[k][2];
        int j = 0;
        while(!minHeap.isEmpty()){
            int[]entry = minHeap.poll();
            res[j][0] = entry[1];
            res[j++][1] = entry[2];
        }
        return res;
    }
}
