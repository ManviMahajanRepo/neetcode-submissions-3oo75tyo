class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        maxProfit = 0
        minBuy = prices[0]

        for price in prices:
            profit = price - minBuy
            minBuy = min(minBuy,price)
            maxProfit = max(maxProfit,profit)
        return maxProfit

            
        