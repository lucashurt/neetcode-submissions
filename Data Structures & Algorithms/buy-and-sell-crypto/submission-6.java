class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, l = 0,r = 0;  
        while(r<prices.length){
            if(prices[l]>prices[r]){
                l = r;
            }
            else{
                res = Math.max(res, prices[r] - prices[l]);
                r++;
            }
        }  
        return res;
    }
}
