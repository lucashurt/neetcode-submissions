class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1,res=0;
        while(r<prices.length){
            if(prices[r]-prices[l]>res){
                res = prices[r]-prices[l];
            }
            if(prices[r]<prices[l]){
                l++;
            }
            else{
                r++;
            }
        }
        return res;
    }
}
