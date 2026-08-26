class Solution {
    int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length,cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        for(int r = 0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c] == 0){
                    q.offer(new int[] {r,c});
                }
            }
        }

        while(!q.isEmpty()){
                int[] cur = q.poll();
                int row = cur[0] , col = cur[1];
                for(int[]d : directions){
                    int newRow = row + d[0], newCol = col + d[1];
                    if(newRow<0 || newCol<0 || newRow>=rows || newCol>=cols || grid[newRow][newCol] != Integer.MAX_VALUE){
                        continue;
                    }
                    q.offer(new int[]{newRow,newCol});
                    grid[newRow][newCol] = grid[row][col] + 1;
                }
            }
        }
    }

