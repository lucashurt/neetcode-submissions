class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0;
        int r = 0;
        int res = r;
        for(int i=0;i<piles.length;i++){
            l+= piles[i];
            if(r<piles[i]) r = piles[i];
        }
        l/=h;
        while(l<=r){
            int m = (l+r)/2;
            long count = 0;
            for(int i=0;i<piles.length;i++){
                count += Math.ceil((double)piles[i]/m);
            }
            if(count<=h){
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
