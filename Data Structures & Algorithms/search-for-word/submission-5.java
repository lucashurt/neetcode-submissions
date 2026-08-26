class Solution {
    public boolean exist(char[][] board, String word) {
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c] == word.charAt(0)){
                    if(dfs(board,r,c,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int row, int col,String word, int index){
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || word.charAt(index) != board[row][col] || board[row][col] == '#'){
            return false;
        }

        if(index == word.length() - 1){
            return true;
        }
        

        char character = board[row][col];
        board[row][col] = '#';
        boolean res = (
            dfs(board,row+1,col,word,index+1) ||
            dfs(board,row-1,col,word,index+1) ||
            dfs(board,row,col+1,word,index+1) ||
            dfs(board,row,col-1,word,index+1)
        );
        board[row][col] = character;
        return res;
    }
}
