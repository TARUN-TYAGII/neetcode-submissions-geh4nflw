class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit=0
        minn=prices[0]

        for ele in prices:
            minn = min(minn, ele)
            profit = max(profit, ele-minn)
        return profit
        