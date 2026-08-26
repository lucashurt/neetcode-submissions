class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for(int row = 0; row<9;row++){
            for(int col = 0;col<9;col++){
                if(board[row][col] == '.') continue;
                String rowString = board[row][col] + " found in row " + row;
                String colString = board[row][col] + " found in col " + col;
                String squareString = board[row][col] + " found in square " + row/3 +"," + col/3;

                if(!seen.add(rowString) || !seen.add(colString) ||!seen.add(squareString)){
                    return false;
                }
            }
        }
        return true;
    }
}
