class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while(l<=r){
            long count = 0;
            int k = (l+r)/2;
            for(int i=0;i<piles.length;i++){
                count+=Math.ceil((double) piles[i]/k);
            }
            if(count<=h){
                res = k;
                r = k-1;
            }
            else{
                l = k+1;
            }
        }
     return res;
    }
}
