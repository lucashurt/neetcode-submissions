class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1,r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        while(r>=l){
            int m = (r+l)/2;
            long totalTime = 0;
            for(int i=0;i<piles.length;i++){
                totalTime += Math.ceil((double)piles[i]/m);
            }
            if(totalTime<=h){
                res = m;
                r = m-1;
            }
            else{
                l = m+1;
            }
        }
        return res;
    }
}
