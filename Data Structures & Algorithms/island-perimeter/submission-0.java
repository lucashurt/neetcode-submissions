class Solution {
    public int islandPerimeter(int[][] grid) {
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    q.offer(new int[]{i,j});
                    visited[i][j] = true;
                    int perimiter = 0;
                    while(!q.isEmpty()){
                        int[] cell = q.poll();
                        int row = cell[0],col = cell[1];
                        for(int[] direction : directions){
                            int newRow = row + direction[0], newCol = col + direction[1];
                            if(newRow<0 || newCol<0 || newRow >= grid.length || newCol>=grid[0].length || grid[newRow][newCol] == 0){
                                perimiter++;
                            }
                            else if(!visited[newRow][newCol]){
                                q.offer(new int[]{newRow,newCol});
                                visited[newRow][newCol] = true;
                            }
                        }
                    } 
                    return perimiter;
                }
            }
        }
        return 0;
    }
}