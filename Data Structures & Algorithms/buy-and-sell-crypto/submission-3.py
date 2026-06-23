class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minn = prices[0]
        ans=0

        for num in prices:
            minn = min(num, minn)
            ans = max(ans, num - minn)
        return ans
        