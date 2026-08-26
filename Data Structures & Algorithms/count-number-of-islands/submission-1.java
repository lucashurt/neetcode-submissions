class Solution {
    private int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
        int islands = 0;
        Set<int[]> visited = new HashSet<>();
        int rows = grid.length, cols = grid[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == '1' && !visited.contains(new int[]{i,j})){
                    bfs(grid,i,j,visited);
                    islands++;
                }
            }
        }
        return islands;
    }
    public void bfs(char[][] grid, int row, int col, Set<int[]>visited){
        Queue<int[]> q = new LinkedList<>();
        grid[row][col] = '0';
        q.offer(new int[]{row,col});
        visited.add(new int[]{row,col});

        while(!q.isEmpty()){
            int[] point = q.poll();
            for(int[] direction: directions){
                int newRow = point[0] + direction[0];
                int newCol = point[1] + direction[1];
                int maxRow = grid.length, maxCol = grid[0].length;
                if(newRow>=0 && newRow<maxRow && newCol>=0 && newCol<maxCol && grid[newRow][newCol] == '1'){
                    q.offer(new int[]{newRow,newCol});
                    visited.add(new int[]{newRow,newCol});
                    grid[newRow][newCol] = '0';
                }
            }
        }
    }
}
