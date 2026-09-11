class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        minn=prices[0]

        for price in prices:
            minn= min(minn,price)
            profit= max(profit,price-minn)
        return profit
        