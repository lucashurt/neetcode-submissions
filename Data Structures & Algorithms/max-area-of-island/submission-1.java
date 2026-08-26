class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                area = Math.max(area,dfs(r,c,grid));
            }
        }
        return area;
    }
    public int dfs(int r, int c, int[][] grid){
        if(r<0 || c<0 || r>grid.length-1 || c>grid[0].length-1 || grid[r][c] == 0){
            return 0;
        }
        
        grid[r][c] = 0;
        int res = 1;
        res += (dfs(r-1,c,grid) + dfs(r+1,c,grid) + dfs(r,c-1,grid) + dfs(r,c + 1,grid));
        return res;
    }
}
