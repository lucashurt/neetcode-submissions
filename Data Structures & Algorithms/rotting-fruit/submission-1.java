class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0,res = 0;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> q = new LinkedList<>();
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c] == 1){
                    fresh++;
                }
                else if(grid[r][c] == 2){
                    q.offer(new int[] {r,c});
                }
            }
        }
        while(!q.isEmpty() && fresh>0){
            int qSize = q.size();
            for(int i = 0;i<qSize;i++){
                int[] rottingFruit = q.poll();
                for(int[]direction: directions){
                    int row = direction[0] + rottingFruit[0];
                    int col = direction[1] + rottingFruit[1];
                    if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || grid[row][col] == 0 || grid[row][col] == 2){
                        continue;
                    }
                    else if(grid[row][col] == 1){
                        grid[row][col] = 2;
                        fresh--;
                        q.offer(new int[] {row,col});
                    }
                }
            }
            res ++;
        }
        return fresh == 0 ? res : -1;
    }
}
