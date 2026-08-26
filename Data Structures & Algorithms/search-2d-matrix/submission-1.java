class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0, bot = rows-1;
        while(top<=bot){
            int middle = (top+bot)/2;
            if(matrix[middle][0]>target){
                bot = middle - 1;
                continue;
            }
            else if(matrix[middle][cols-1]<target){
                top = middle  + 1;
            }
            else{
              break;  
            }
        }    
        if(!(top<=bot)) return false;

        int middle = (top + bot)/2;
        int l = 0, r = cols-1;

        while(l<=r){
            int center = (l+r)/2;
            if(matrix[middle][center] == target){
                return true;
            }
            else if(matrix[middle][center]<target){
                l = center+1;
            }
            else{
                r = center-1;

            }
        }

        return false;
    }
}
