class Solution:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        pf=[0]*n
        sf=[0]*n

        pf[0]=height[0]
        sf[n-1]=height[n-1]

        for i in range(1,n):
            pf[i]=max(pf[i-1],height[i])

        for i in range(n-2,-1,-1):
            sf[i]=max(height[i],sf[i+1])

        ans=0
        for i in range(n):
            ans += min(sf[i],pf[i])-height[i]
        return ans


        