class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int r = 0; r<grid.length;r++){
            for(int c = 0;c<grid[0].length;c++){
                if(grid[r][c] == 1){
                    area = Math.max(area,dfs(grid,r,c));
                }
            }
        }
        return area;
    }

    public int dfs(int[][] grid, int r,int c){
        if(r<0||r>grid.length-1 || c<0 || c>grid[0].length - 1 || grid[r][c] == 0){
            return 0;
        }
        grid[r][c] = 0;
        int res = 1;
        res += (dfs(grid,r-1,c) + dfs(grid,r+1,c) + dfs(grid,r,c-1) + dfs(grid,r,c+1));
        return res;
    }
}
