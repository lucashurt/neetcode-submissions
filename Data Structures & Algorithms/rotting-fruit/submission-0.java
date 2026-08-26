class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int res = 0;

        for(int r=0;r<grid.length;r++){
            for(int c = 0;c<grid[0].length;c++){
                if(grid[r][c] == 1){
                    fresh++;
                }
                else if(grid[r][c] == 2){
                    q.offer(new int[] {r,c});
                }
            }
        }
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        while(fresh > 0 && !q.isEmpty()){
            int qSize = q.size();
            for(int i = 0;i<qSize;i++){
                int[] location = q.poll();
                for(int[] direction : directions){
                    int row = location[0] + direction[0];
                    int col = location[1] + direction[1];
                    if( row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col] == 1){
                        grid[row][col] = 2;
                        q.offer(new int[]{row,col});
                        fresh--;
                    }
                }
            }
        res++;
        }
        return fresh == 0 ? res : -1;
    }
}
