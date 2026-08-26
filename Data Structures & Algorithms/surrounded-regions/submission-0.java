class Solution {
    int[][] directions = {{0,1},{-1,0},{0,-1},{1,0}};
    int rows, cols;

    public void solve(char[][] board) {
        rows = board.length;
        cols = board[0].length;
        bfs(board);

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(board[r][c] == 'O'){
                    board[r][c] = 'X';
                }
                else if(board[r][c] == '#'){
                    board[r][c] = 'O';
                }
            }
        }
    }

    public void bfs(char[][] board){
        rows = board.length;
        cols = board[0].length;

        Queue<int[]> q = new LinkedList<>();
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(r == 0 || c == 0 || r == rows-1 || c == cols-1 && board[r][c] == 'O'){
                    q.offer(new int[] {r,c});
                }
            }
        }

        while(!q.isEmpty()){
            int cur[] = q.poll();
            int r = cur[0], c = cur[1];
            if(board[r][c] == 'O'){
                board[r][c] = '#';
                for(int[] d : directions){
                    int nr = r + d[0], nc = c + d[1];{
                    if(nr>=0 && nr<rows && nc>=0 && nc<cols){
                            q.offer(new int[] {nr,nc});
                        }
                    }
                }
            }
        }
    }
}
