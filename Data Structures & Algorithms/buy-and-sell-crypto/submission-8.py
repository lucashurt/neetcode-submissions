class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0
        l = 0
        for r in range(len(prices)):
            diff = prices[r] - prices[l]
            maxP = max(maxP,diff)
            if(prices[r] < prices[l]):
                l = r
                
        return maxP


        
        