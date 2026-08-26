class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1,res=0;
        while(l<r){
            int area = (r-l) * Math.min(heights[r],heights[l]);
             res = Math.max(area,res);
            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return res;
    }
}
