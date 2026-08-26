class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxP = 0
        minPrice = prices[0]

        for price in prices:
            if price < minPrice:
                minPrice = price
            else:
                profit = price - minPrice
                if(profit > maxP):
                    maxP = profit
        return maxP
        