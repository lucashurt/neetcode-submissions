class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1,res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[l]>prices[r]){
                l=r;
            }
            else{
                res = Math.max(res,prices[r]-prices[l]);
            }
            r++;
        }
        return res;
    }
}
