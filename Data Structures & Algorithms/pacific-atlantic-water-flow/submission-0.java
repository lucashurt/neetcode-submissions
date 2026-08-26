class Solution {
    int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        Queue<int[]> pq = new LinkedList<>();
        Queue<int[]> aq = new LinkedList<>();

        boolean[][] pac = new boolean[heights.length][heights[0].length];
        boolean[][] atl = new boolean[heights.length][heights[0].length];

        for(int r=0;r<heights.length;r++){
            pq.offer(new int[] {r,0});
            aq.offer(new int[] {r,heights[0].length-1});
        }
        for(int c=0;c<heights[0].length;c++){
            pq.offer(new int[] {0,c});
            aq.offer(new int[] {heights.length-1,c});
        }

        bfs(heights,pq,pac);
        bfs(heights,aq,atl);

        List<List<Integer>> res = new ArrayList<>();

        for(int r=0;r<heights.length;r++){
            for(int c=0;c<heights[0].length;c++){
                if(pac[r][c] && atl[r][c]){
                    res.add(Arrays.asList(r,c));
                }
        }
    }
    return res;
    }
    public void bfs(int[][] heights, Queue<int[]> q, boolean[][] ocean){
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int row = cur[0],col = cur[1];
            ocean[row][col] = true;
            for(int[] direction: directions){
                int newRow = row+direction[0] ,newCol = col+direction[1];
                if(newRow>=0 && newCol>=0 && newRow<heights.length && newCol<heights[0].length && heights[newRow][newCol] >= heights[row][col] && !ocean[newRow][newCol]){
                    q.offer(new int[] {newRow,newCol});
                }
            }
        }
    }
}
