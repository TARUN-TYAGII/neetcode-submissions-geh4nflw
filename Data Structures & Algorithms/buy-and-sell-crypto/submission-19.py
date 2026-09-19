class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minn=prices[0]
        ans=0
        for i in range(1,len(prices)):
            minn = min(minn, prices[i])
            ans = max(ans, prices[i]-minn)
        return ans

